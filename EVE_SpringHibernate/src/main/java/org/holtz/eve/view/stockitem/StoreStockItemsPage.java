package org.holtz.eve.view.stockitem;
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
import java.util.Iterator;
import java.util.List;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.RefreshingView;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.holtz.eve.controller.StockItemController;
import org.holtz.eve.jpa.dao.StoreStockItemDAO;
import org.holtz.eve.jpa.dao.impl.StoreStockItemDAOImpl;
import org.holtz.eve.jpa.entity.S01StockItemSearch;


/**
 * page that demonstrates a RefreshingView
 * 
 * @see RefreshingView
 * 
 * @author igor
 */
public class StoreStockItemsPage extends BasePage
{
    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     */
    public StoreStockItemsPage()
    {
        final List<IModel<S01StockItemSearch>> stockItems = new ArrayList<IModel<S01StockItemSearch>>(10);

        // populate list of contacts to be displayed
        //Need to change this to Spring Controller
        SortableStockItemDataProvider sidp = new SortableStockItemDataProvider();
        StockItemController sic = new StockItemController();
        List<S01StockItemSearch> stockItemList = new ArrayList<S01StockItemSearch>();
        stockItemList = sic.getStoreStockItemDAO().listAllStoreStockItem();
        Iterator<S01StockItemSearch> it = stockItemList.listIterator();
        while (it.hasNext())
        {
            stockItems.add(sidp.model(it.next()));
        }

        // create the refreshing view
        RefreshingView<S01StockItemSearch> view = new RefreshingView<S01StockItemSearch>("view")
        {
            private static final long serialVersionUID = 1L;

            /**
             * Return an iterator over models for items in the view
             */
            @Override
            protected Iterator<IModel<S01StockItemSearch>> getItemModels()
            {
                Iterator<IModel<S01StockItemSearch>> iterator = (Iterator<IModel<S01StockItemSearch>>) sidp.iterator(0, 10);
				return iterator;
            }

            @Override
            protected void populateItem(final Item<S01StockItemSearch> item)
            {
            	S01StockItemSearch stockItem = item.getModelObject();
                item.add(new Label("stockItemId", item.getId()));
                item.add(new ActionPanel("actions", item.getModel()));
                item.add(new Label("stockItemId", String.valueOf(stockItem.getId())));
                item.add(new Label("stockItemTx", stockItem.getId().getSistockItemTx()));
                item.add(new Label("Description", stockItem.getId().getStstockTypeTx()));
                item.add(new Label("Supplier", stockItem.getId().getSuSupplierTx()));
                item.add(new Label("Barcode", stockItem.getId().getSibarcodeNoTxN()));

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

        add(view);
        String refresh = "refreshLink";
        add(new Link<Void>(refresh)
        {
            private static final long serialVersionUID = 1L;

            @Override
            public void onClick()
            {
                // noop
            }
        });
    }
}