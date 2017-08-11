package org.holtz.eve.view.stockitem;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.S01StockItemSearchId;

public class DetachableStockItemSearchModel extends LoadableDetachableModel<S01StockItemSearch> 
{

    private final long id;

//    protected StockItemDatabase getContactsDB()
//    {
//        return DatabaseLocator.getDatabase();
//    }

    /**
     * @param c
     */
    public DetachableStockItemSearchModel(S01StockItemSearch item)
    {
        this(item.getId());
    }

    /**
     * @param s01StockItemSearchId.getId()
     */
    public DetachableStockItemSearchModel(S01StockItemSearchId stockItemSearch)
    {
        if (stockItemSearch.getSistockItemId() == 0)
        {
            throw new IllegalArgumentException();
        }
        this.id = stockItemSearch.getSistockItemId();
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        return Long.valueOf(id).hashCode();
    }

    /**
     * used for dataview with ReuseIfModelsEqualStrategy item reuse strategy
     * 
     * @see org.apache.wicket.markup.repeater.ReuseIfModelsEqualStrategy
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        else if (obj == null)
        {
            return false;
        }
        else if (obj instanceof DetachableStockItemSearchModel)
        {
        	DetachableStockItemSearchModel other = (DetachableStockItemSearchModel)obj;
            return other.id == id;
        }
        return false;
    }

    /**
     * @see org.apache.wicket.model.LoadableDetachableModel#load()
     */
    @Override
    protected S01StockItemSearch load()
    {
       // loads contact from the database
  //      return getContactsDB().get(id);
        return getObject();
    }
}
