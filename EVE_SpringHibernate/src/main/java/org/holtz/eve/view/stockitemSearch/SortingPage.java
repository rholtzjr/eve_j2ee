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

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.extensions.markup.html.repeater.data.sort.OrderByBorder;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
/**
 * page that demonstrates dataview and sorting
 * 
 * @author igor
 * 
 */
public class SortingPage extends StockItemBasePage
{
    private static final long serialVersionUID = 1L;

    /**
     * constructor
     */
    public SortingPage()
    {
        SortableStockItemDataProvider dp = new SortableStockItemDataProvider();
        DataView<S01StockItemSearch> dataView = new DataView<S01StockItemSearch>("sorting", dp)
        {
            private static final long serialVersionUID = 1L;

            @Override
            protected void populateItem(final Item<S01StockItemSearch> item)
            {
            	S01StockItemSearch stockItem = item.getModelObject();
                item.add(new ActionPanel("actions", item.getModel()));
                item.add(new Label("stockItemId", String.valueOf(stockItem.getSIStockItemID())));
                item.add(new Label("stockItemName", stockItem.getSIStockItemTx()));
                item.add(new Label("supplier", stockItem.getSuSupplierTx()));
                item.add(new Label("barcode", stockItem.getSIBarcodeNoTx_N()));
                

                item.add(AttributeModifier.replace("class", new AbstractReadOnlyModel<String>()
                {
                    private static final long serialVersionUID = 1L;

                    @Override
                    public String getObject()
                    {
                        return (item.getIndex() % 2 == 1) ? "even" : "odd";
                    }
                }));
            }
        };

        dataView.setItemsPerPage(8L);

        add(new OrderByBorder("orderById", "stockItemId", dp)
        {
            private static final long serialVersionUID = 1L;

            @Override
            protected void onSortChanged()
            {
                dataView.setCurrentPage(0);
            }
        });

        add(new OrderByBorder("orderByName", "stockItemName", dp)
        {
            private static final long serialVersionUID = 1L;

            @Override
            protected void onSortChanged()
            {
                dataView.setCurrentPage(0);
            }
        });
        add(new OrderByBorder("orderBySupplier", "supplier", dp)
        {
            private static final long serialVersionUID = 1L;

            @Override
            protected void onSortChanged()
            {
                dataView.setCurrentPage(0);
            }
        });
        
        add(new OrderByBorder("orderBybarcode", "barcode", dp)
        {
            private static final long serialVersionUID = 1L;

            @Override
            protected void onSortChanged()
            {
                dataView.setCurrentPage(0);
            }
        });

        add(dataView);

        add(new PagingNavigator("navigator", dataView));
    }
}