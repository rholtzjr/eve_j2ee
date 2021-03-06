package org.holtz.eve.view.customer;

import org.apache.wicket.model.LoadableDetachableModel;
import org.holtz.eve.jpa.entity.S01CuCust;

public class DetachableCustomerModel extends LoadableDetachableModel<S01CuCust> 
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final long id;

    /**
     * @param c
     */
//     public DetachableCustomerModel(S01CuCust item)
//     {
//   	 this(item.getCuCustID());
//    }

    /**
     * @param s01StockItemSearchId.getId()
     */
    public DetachableCustomerModel(S01CuCust custItem)
    {
        if (custItem.getCuCustID() < 0 )
        {
            throw new IllegalArgumentException();
        }
        this.id = custItem.getCuCustID();
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
        else if (obj instanceof DetachableCustomerModel)
        {
        	DetachableCustomerModel other = (DetachableCustomerModel)obj;
            return other.id == id;
        }
        return false;
    }

    /**
     * @see org.apache.wicket.model.LoadableDetachableModel#load()
     */
    @Override
    protected S01CuCust load()
    {
        return getObject();
    }
}
