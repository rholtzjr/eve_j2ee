package org.holtz.eve.view.stockitemSearch;

import org.apache.wicket.model.LoadableDetachableModel;
import org.holtz.eve.jpa.entity.S01StockItemSearch;

public class DetachableStockItemSearchModel extends LoadableDetachableModel<S01StockItemSearch> 
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final long id;

    /**
     * @param c
     */
//    public DetachableStockItemSearchModel(S01StockItemSearch item)
//    {
//        this(item.getId());
//    }

    /**
     * @param s01StockItemSearchId.getId()
     */
    public DetachableStockItemSearchModel(S01StockItemSearch stockItemSearch)
    {
        if (stockItemSearch.getSIStockItemID() < 0)
        {
            throw new IllegalArgumentException();
        }
        this.id = stockItemSearch.getSIStockItemID();
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
        return getObject();
    }
}
