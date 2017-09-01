package org.holtz.eve.view.customer;

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
import org.holtz.eve.jpa.entity.S01CuCust;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;


/**
 * demo page for the datatable component
 * 
 * @see org.apache.wicket.extensions.markup.html.repeater.data.table.DefaultDataTable
 * @author igor
 * 
 */
public class CustomerDataTablePage extends CustomerBasePage
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	private StockItemDetailPanel modalContent;
	

	/**
     * constructor
     */

	public CustomerDataTablePage()
    {
   			
      final Label resultLabel = new Label("resultLabel", new Model<>(getEditSelected()));
      resultLabel.setOutputMarkupId(true);
      add(resultLabel);

    	List<IColumn<S01CuCust, String>> columns = new ArrayList<IColumn<S01CuCust, String>>();
        
     
        columns.add(new AbstractColumn<S01CuCust, String>(new Model<>("Actions"))
        {

			private static final long serialVersionUID = 1L;
			
			@Override
            public void populateItem(Item<ICellPopulator<S01CuCust>> cellItem, String componentId,
                IModel<S01CuCust> model)
            {
                cellItem.add(new ActionPanel(componentId, model));
            }


        });

        columns.add(new PropertyColumn<S01CuCust, String>(new Model<>("Customer Id"), "custId", "cuCustID")
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
        
        columns.add(new PropertyColumn<S01CuCust, String>(new Model<>("First Name"), "custFirstName", "cuFirstNameTx"));
        columns.add(new PropertyColumn<S01CuCust, String>(new Model<>("Last Name"), "custLastName", "cuLastNameTx"));
        columns.add(new PropertyColumn<S01CuCust, String>(new Model<>("Customer Number"), "custNumber", "cuCustNumberTx_N"));
        SortableCustomerDataProvider provider = new SortableCustomerDataProvider();
        DataTable<S01CuCust, String> custItemTable = new DataTable<>("custItemTable", columns, provider, 10);
        custItemTable.addBottomToolbar(new ExportToolbar(custItemTable).addDataExporter(new CSVDataExporter()));
        custItemTable.setOutputMarkupId(true);
        
        FilterForm<CustomerFilter> filterForm = new FilterForm<>("filterForm", provider);
        
        filterForm.add(new TextField<>("custId", PropertyModel.of(provider, "filterState.custId")));
        filterForm.add(new TextField<>("custFirstName", PropertyModel.of(provider, "filterState.custFirstName")));
        filterForm.add(new TextField<>("custLastName", PropertyModel.of(provider, "filterState.custLastName")));
        filterForm.add(new TextField<>("custNumber", PropertyModel.of(provider, "filterState.custNumber")));
        add(filterForm);

        custItemTable.addTopToolbar(new FilterToolbar(custItemTable, filterForm));
        custItemTable.addTopToolbar(new NavigationToolbar(custItemTable));
        custItemTable.addTopToolbar(new HeadersToolbar<>(custItemTable, provider));
        filterForm.add(custItemTable);
    

    }
    
}