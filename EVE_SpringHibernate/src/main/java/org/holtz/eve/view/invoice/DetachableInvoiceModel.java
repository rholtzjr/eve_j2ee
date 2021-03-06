package org.holtz.eve.view.invoice;

import org.apache.wicket.model.LoadableDetachableModel;
import org.holtz.eve.jpa.entity.S01InInvoice;

public class DetachableInvoiceModel extends LoadableDetachableModel<S01InInvoice> 
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final long id;

    /**
     * @param c
     */
//     public DetachableInvoiceModel(S01InInvoice item)
//     {
//   	 this(item.getInInvoiceID());
//    }

    /**
     * @param s01StockItemSearchId.getId()
     */
    public DetachableInvoiceModel(S01InInvoice custItem)
    {
        if (custItem.getInInvoiceID() < 0 )
        {
            throw new IllegalArgumentException();
        }
        this.id = custItem.getInInvoiceID();
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
        else if (obj instanceof DetachableInvoiceModel)
        {
        	DetachableInvoiceModel other = (DetachableInvoiceModel)obj;
            return other.id == id;
        }
        return false;
    }

    /**
     * @see org.apache.wicket.model.LoadableDetachableModel#load()
     */
    @Override
    protected S01InInvoice load()
    {
        return getObject();
    }
}
