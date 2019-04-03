package org.holtz.eve.view.stockitemSearch;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.Session;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.extensions.markup.html.repeater.data.grid.ICellPopulator;
import org.apache.wicket.extensions.markup.html.repeater.data.table.AbstractColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.HeadersToolbar;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.NavigationToolbar;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.export.CSVDataExporter;
import org.apache.wicket.extensions.markup.html.repeater.data.table.export.ExportToolbar;
import org.apache.wicket.extensions.markup.html.repeater.data.table.filter.FilterForm;
import org.apache.wicket.extensions.markup.html.repeater.data.table.filter.FilterToolbar;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;


/**
 * demo page for the datatable component
 * 
 * @see org.apache.wicket.extensions.markup.html.repeater.data.table.DefaultDataTable
 * @author igor
 * 
 */
public class StockItemSearchDataTablePage extends StockItemBasePage
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * constructor
     */
   
	public StockItemSearchDataTablePage()
    {
   			
      final Label resultLabel = new Label("resultLabel", new Model<>(getEditSelected()));
      resultLabel.setOutputMarkupId(true);
      add(resultLabel);

    	List<IColumn<S01StockItemSearch, String>> columns = new ArrayList<IColumn<S01StockItemSearch, String>>();
        
     
        columns.add(new AbstractColumn<S01StockItemSearch, String>(new Model<>("Actions"))
        {

			private static final long serialVersionUID = 1L;
			
			@Override
            public void populateItem(Item<ICellPopulator<S01StockItemSearch>> cellItem, String componentId,
                IModel<S01StockItemSearch> model)
            {
                cellItem.add(new ActionPanel(componentId, model));
            }


        });

        columns.add(new PropertyColumn<S01StockItemSearch, String>(new Model<>("Stock Id"), "stockItemId", "SIStockItemID")
        {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			/**
			 * 
			 */

			@Override
            public String getCssClass()
            {
                return "numeric";
            }
        });
        
        columns.add(new PropertyColumn<S01StockItemSearch, String>(new Model<>("Stock Item Name"), "stockItemName", "SIStockItemTx"));
        columns.add(new PropertyColumn<S01StockItemSearch, String>(new Model<>("Supplier"), "supplier", "suSupplierTx"));
        columns.add(new PropertyColumn<S01StockItemSearch, String>(new Model<>("Barcode"), "barcode", "SIBarcodeNoTx_N"));
        SortableStockItemDataProvider provider = new SortableStockItemDataProvider();
        DataTable<S01StockItemSearch, String> stockItemTable = new DataTable<>("stockItemTable", columns, provider, 10);
        stockItemTable.addBottomToolbar(new ExportToolbar(stockItemTable).addDataExporter(new CSVDataExporter()));
        stockItemTable.setOutputMarkupId(true);
        
        FilterForm<StockItemFilter> filterForm = new FilterForm<>("filterForm", provider);
        
        filterForm.add(new TextField<>("stockItemId", PropertyModel.of(provider, "filterState.stockItemId")));
        filterForm.add(new TextField<>("stockItemName", PropertyModel.of(provider, "filterState.stockItemName")));
        filterForm.add(new TextField<>("stockItemSupplier", PropertyModel.of(provider, "filterState.stockItemSupplier")));
        filterForm.add(new TextField<>("stockItemBarcode", PropertyModel.of(provider, "filterState.stockItemBarcode")));
        add(filterForm);
        editModal = new StockItemModalWindow("stockitemmodalwindow", getEditSelected()) {

			private static final long serialVersionUID = 1L;

			
			void onSelect(AjaxRequestTarget target, TZlStoreStockItem item) {
					
					close(target);
	          
	            }

	            void onCancel(AjaxRequestTarget target) {

	                close(target);
	            }

				@Override
				void onSelect(AjaxRequestTarget target) {
				
	                close(target);
				}
	            
		};
		Session session = editModal.getWebSession();
		session.setAttribute("modalContent", getEditSelected());
        editModal.setOutputMarkupId(true);
        editModal.setOutputMarkupPlaceholderTag(true);
		filterForm.addOrReplace(editModal);  

        stockItemTable.addTopToolbar(new FilterToolbar(stockItemTable, filterForm));
        stockItemTable.addTopToolbar(new NavigationToolbar(stockItemTable));
        stockItemTable.addTopToolbar(new HeadersToolbar<>(stockItemTable, provider));
        filterForm.add(stockItemTable);
    

    }
    
}