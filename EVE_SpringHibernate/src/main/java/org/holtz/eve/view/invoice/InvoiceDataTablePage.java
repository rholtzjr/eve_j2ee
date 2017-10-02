package org.holtz.eve.view.invoice;

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
import org.holtz.eve.jpa.entity.S01InInvoice;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;


/**
 * demo page for the datatable component
 * 
 * @see org.apache.wicket.extensions.markup.html.repeater.data.table.DefaultDataTable
 * @author igor
 * 
 */
public class InvoiceDataTablePage extends InvoiceBasePage
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	private StockItemDetailPanel modalContent;
	

	/**
     * constructor
     */

	public InvoiceDataTablePage()
    {
   			
      final Label resultLabel = new Label("resultLabel", new Model<>(getSelectedItem()));
      resultLabel.setOutputMarkupId(true);
      add(resultLabel);

    	List<IColumn<S01InInvoice, String>> columns = new ArrayList<IColumn<S01InInvoice, String>>();
        
     
        columns.add(new AbstractColumn<S01InInvoice, String>(new Model<>("Actions"))
        {

			private static final long serialVersionUID = 1L;
			
			@Override
            public void populateItem(Item<ICellPopulator<S01InInvoice>> cellItem, String componentId,
                IModel<S01InInvoice> model)
            {
                cellItem.add(new ActionPanel(componentId, model));
            }


        });

        columns.add(new PropertyColumn<S01InInvoice, String>(new Model<>("Invoice Id"), "invId", "inInvoiceID")
        {
            /**
			 * 
			 */

			@Override
            public String getCssClass()
            {
                return "numeric";
            }
        });
        
        columns.add(new PropertyColumn<S01InInvoice, String>(new Model<>("Invoice Date"), "invCreateDate", "inCreationDate"));
        columns.add(new PropertyColumn<S01InInvoice, String>(new Model<>("Customer Number"), "invCustId", "inCuCustID"));
        columns.add(new PropertyColumn<S01InInvoice, String>(new Model<>("Invoice Number"), "invNumber_Tx_N", "inNumberTx_N"));
        SortableInvoiceDataProvider provider = new SortableInvoiceDataProvider();
        DataTable<S01InInvoice, String> invoiceTable = new DataTable<>("invoiceTable", columns, provider, 10);
        invoiceTable.addBottomToolbar(new ExportToolbar(invoiceTable).addDataExporter(new CSVDataExporter()));
        invoiceTable.setOutputMarkupId(true);
        
        FilterForm<InvoiceFilter> filterForm = new FilterForm<>("filterForm", provider);
        
        filterForm.add(new TextField<>("invId", PropertyModel.of(provider, "filterState.invId")));
        filterForm.add(new TextField<>("invCreateDate", PropertyModel.of(provider, "filterState.invCreateDate")));
        filterForm.add(new TextField<>("invCustId", PropertyModel.of(provider, "filterState.invCustId")));
        filterForm.add(new TextField<>("invNumber_Tx_N", PropertyModel.of(provider, "filterState.invNumber_Tx_N")));
        add(filterForm);

        invoiceTable.addTopToolbar(new FilterToolbar(invoiceTable, filterForm));
        invoiceTable.addTopToolbar(new NavigationToolbar(invoiceTable));
        invoiceTable.addTopToolbar(new HeadersToolbar<>(invoiceTable, provider));
        filterForm.add(invoiceTable);
    

    }
    
}