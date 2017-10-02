package org.holtz.eve.view.invoice;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.wicket.extensions.markup.html.repeater.data.sort.SortOrder;
import org.apache.wicket.extensions.markup.html.repeater.data.table.filter.IFilterStateLocator;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.holtz.eve.jpa.dao.S01InInvoiceDAO;
import org.holtz.eve.jpa.dao.impl.S01InInvoiceDAOImpl;
import org.holtz.eve.jpa.entity.S01InInvoice;
import org.holtz.eve.view.DatabaseLocator;

public class SortableInvoiceDataProvider extends SortableDataProvider<S01InInvoice, String> implements IFilterStateLocator<InvoiceFilter>, Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private InvoiceFilter invoiceFilter = new InvoiceFilter();
    @SpringBean
    private transient S01InInvoiceDAO invItemDAO;
    private List<S01InInvoice> invItemList = new ArrayList<S01InInvoice>();
    private S01InInvoice invItem = new S01InInvoice();
    
    
    /**
     * constructor
     */
    public SortableInvoiceDataProvider()
    {
    	invItemDAO = new S01InInvoiceDAOImpl();
    	setSort("invId", SortOrder.NONE);
    	invItemList = invItemDAO.getInInvoiceList();
    	invItemList.removeAll(Collections.singleton(null));
    }

    protected InvoiceDatabase getInvoiceDB()
    {
    	DatabaseLocator.getInvoiceDatabase(invItemList);
    	return new InvoiceDatabase(invItemList);
    }

    @Override
    public Iterator<? extends S01InInvoice> iterator(long first, long count)
    {
        List<S01InInvoice> invoiceSearchsFound = getInvoiceDB().getIndex(getSort());
        List<S01InInvoice> filteredInvoices = filterInvoiceSearchs(invoiceSearchsFound);
        if (filteredInvoices.size() > count)
        	return filterInvoiceSearchs(invoiceSearchsFound).subList((int)first, (int)(first + count)).iterator();
        else
        	return filterInvoiceSearchs(invoiceSearchsFound).subList((int)first, (int)(first + filteredInvoices.size())).iterator();
    }

    private List<S01InInvoice> filterInvoiceSearchs(List<S01InInvoice> invoiceSearchsFound)
    {
        ArrayList<S01InInvoice> result = new ArrayList<>();
        String invId = invoiceFilter.getInvId();
        Timestamp invCreateDate = invoiceFilter.getInvCreateDate();
        String invNumber = invoiceFilter.getInvNumber_Tx_N();
        String invCustId = invoiceFilter.getInvCustId();
        for(int i = 0; i < invoiceSearchsFound.size(); i++) {
        	String filterId = Integer.toString(invoiceSearchsFound.get(i).getInInvoiceID());
        	Timestamp filterCreateDate = (Timestamp) invoiceSearchsFound.get(i).getInCreationDate();
        	String filterInvNummber = (String) invoiceSearchsFound.get(i).getInInvoiceNumberTx_N();
        	String filterInvCustId =  Integer.toString(invoiceSearchsFound.get(i).getInCustID());
 
        
	        if(invId != null && !filterId.contains(invId))
	        {
	        	continue;
	        }
	        
	        if(invCreateDate != null && !filterCreateDate.equals(invCreateDate))
	        {
	        	continue;
	        }
	        if(invNumber != null && !filterInvNummber.contains(invNumber)){
	           	continue;
	        }
	        if(invCustId != null && !filterInvCustId.contains(invCustId)) {
	        	continue;
	        }
        	
	        result.add(invoiceSearchsFound.get(i));
        }
	        
        return result;
    }


    /**
     * @see org.apache.wicket.markup.repeater.data.IDataProvider#size()
     */
    @Override
    public long size()
    {
 
    	return filterInvoiceSearchs(getInvoiceDB().getIndex(getSort())).size();
    }

    /**
     * @see org.apache.wicket.markup.repeater.data.IDataProvider#model(java.lang.Object)
     */
    public IModel<S01InInvoice> model(S01InInvoice object)
    {
        return new DetachableInvoiceModel(object) {
        		private static final long serialVersionUID = 1L;
		@Override 
        protected S01InInvoice load() { 
			return (S01InInvoice) object; 
        } 
      };
    }

    @Override
    public InvoiceFilter getFilterState()
    {
        return invoiceFilter;
    }

    @Override
    public void setFilterState(InvoiceFilter state)
    {
    	invoiceFilter  = state;
    }

	public S01InInvoice getCustItem() {
		return invItem;
	}
//	public S01InInvoice getCustItem(int id) {
//		invItem = invItemDAO.getCuCustById(id);
//		return invItem;
//	}

	public void setCustItem(S01InInvoice invItem) {
		this.invItem = invItem;
	}
    

}

