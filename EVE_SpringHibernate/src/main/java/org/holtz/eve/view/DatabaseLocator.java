package org.holtz.eve.view;

import java.util.List;

import org.apache.wicket.Application;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.TCuCust;
import org.holtz.eve.view.customer.CustomerDatabase;
import org.holtz.eve.view.stockitemSearch.StockItemDatabase;

/**
 * service locator class for contacts database
 * 
 * @author igor
 * 
 */
public class DatabaseLocator
{
    /**
     * @return contacts database
     */
    public static StockItemDatabase getStockItemDatabase(List<S01StockItemSearch> list)
    {
        EveApplication app = (EveApplication)Application.get();
        return app.getStockItemDB(list);
    }
    public static CustomerDatabase getCustomerDatabase(List<TCuCust> list)
    {
    	EveApplication app = (EveApplication)Application.get();
    	return app.getCustItemDB(list);
    }
}
