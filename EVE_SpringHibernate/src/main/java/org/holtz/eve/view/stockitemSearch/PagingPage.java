package org.holtz.eve.view.stockitemSearch;

import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.view.stockitemSearch.StockItemBasePage;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;

/**
 * Page that demonstrates a paging dataview
 * 
 * @see org.apache.wicket.markup.html.navigation.paging.PagingNavigator
 * @author igor
 * 
 */
public class PagingPage extends StockItemBasePage
{
    private static final long serialVersionUID = 1L;

    /**
     * constructor
     */
    public PagingPage()
    {
        StockItemDataProvider stockItemDataProvider = new StockItemDataProvider();
        
		DataView<S01StockItemSearch> dataView = new DataView<S01StockItemSearch>("pageable", stockItemDataProvider)
        {
            private static final long serialVersionUID = 1L;
            @SuppressWarnings("unchecked")
			
            @Override
            protected void populateItem(final Item<S01StockItemSearch> item)
            {
          	
            	S01StockItemSearch stockItem = (S01StockItemSearch) item.getModelObject();
                item.add(new ActionPanel("actions", item.getModel()));
                item.add(new Label("stockItemid", stockItem.getSIStockItemID()));
                item.add(new Label("stockItemName", stockItem.getSIStockItemTx()));
                item.add(new Label("supplierName", stockItem.getSuSupplierTx()));
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
        add(dataView);

        add(new PagingNavigator("navigator", dataView));
    }
}