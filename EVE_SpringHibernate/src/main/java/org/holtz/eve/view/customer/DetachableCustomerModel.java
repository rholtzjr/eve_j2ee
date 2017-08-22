package org.holtz.eve.view.customer;

import org.apache.wicket.model.LoadableDetachableModel;
import org.holtz.eve.jpa.entity.TCuCust;

public class DetachableCustomerModel extends LoadableDetachableModel<TCuCust> 
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final long id;

    /**
     * @param c
     */
//    public DetachableCustomerModel(TCuCust item)
//    {
//    	 this.id = item.getCuCustId();
//    }

    /**
     * @param s01StockItemSearchId.getId()
     */
    public DetachableCustomerModel(TCuCust custItem)
    {
        if (custItem.getCuCustId() == 0)
        {
            throw new IllegalArgumentException();
        }
        this.id = custItem.getCuCustId();
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
    protected TCuCust load()
    {
        return getObject();
    }
}
