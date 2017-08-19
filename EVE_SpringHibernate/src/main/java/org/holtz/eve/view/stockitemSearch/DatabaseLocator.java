package org.holtz.eve.view.stockitemSearch;

import java.util.List;

import org.apache.wicket.Application;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.view.EveApplication;

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
        EveApplication app = (EveApplication)Application.get();
        return app.getStockItemDB(list);
    }
}
