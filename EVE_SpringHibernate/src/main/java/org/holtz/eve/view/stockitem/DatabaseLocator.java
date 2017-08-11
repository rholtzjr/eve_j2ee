package org.holtz.eve.view.stockitem;

import java.util.List;

import org.apache.wicket.Application;
import org.holtz.eve.jpa.entity.S01StockItemSearch;

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
    public static StockItemDatabase getDatabase(List<S01StockItemSearch> list)
    {
        StockItemApplication app = (StockItemApplication)Application.get();
        return app.getStockItemDB(list);
    }
}
