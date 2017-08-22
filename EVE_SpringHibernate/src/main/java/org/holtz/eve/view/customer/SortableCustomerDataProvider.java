package org.holtz.eve.view.customer;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.wicket.extensions.markup.html.repeater.data.sort.SortOrder;
import org.apache.wicket.extensions.markup.html.repeater.data.table.filter.IFilterStateLocator;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.holtz.eve.jpa.dao.TCuCustDAO;
import org.holtz.eve.jpa.dao.impl.TCuCustDAOImpl;
import org.holtz.eve.jpa.entity.TCuCust;
import org.holtz.eve.view.DatabaseLocator;

public class SortableCustomerDataProvider extends SortableDataProvider<TCuCust, String> implements IFilterStateLocator<CustomerFilter>, Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomerFilter customerFilter = new CustomerFilter();
    @SpringBean
    private transient TCuCustDAO custItemDAO;
    List<TCuCust> custItemList = new ArrayList<TCuCust>();
    TCuCust custItem = new TCuCust();
    
    
    /**
     * constructor
     */
    public SortableCustomerDataProvider()
    {
    	custItemDAO = new TCuCustDAOImpl();
    	setSort("custId", SortOrder.NONE);
    	custItemList = custItemDAO.getCustList();
    	custItemList.removeAll(Collections.singleton(null));
    }

    protected CustomerDatabase getCustomerDB()
    {
    	DatabaseLocator.getCustomerDatabase(custItemList);
    	return new CustomerDatabase(custItemList);
    }

    @Override
    public Iterator<? extends TCuCust> iterator(long first, long count)
    {
        List<TCuCust> customerSearchsFound = getCustomerDB().getIndex(getSort());
        List<TCuCust> filteredCustomer = filterCustomerSearchs(customerSearchsFound);
        if (filteredCustomer.size() > count)
        	return filterCustomerSearchs(customerSearchsFound).subList((int)first, (int)(first + count)).iterator();
        else
        	return filterCustomerSearchs(customerSearchsFound).subList((int)first, (int)(first + filteredCustomer.size())).iterator();
    }

    private List<TCuCust> filterCustomerSearchs(List<TCuCust> customerSearchsFound)
    {
        ArrayList<TCuCust> result = new ArrayList<>();
        String custId = customerFilter.getCustId();
        String custFirstName = customerFilter.getCustFirstName();
        String custLastName = customerFilter.getCustLastName();
        String custNumber = customerFilter.getCustNumber();
        for(int i = 0; i < customerSearchsFound.size(); i++) {
        	String filterId = Integer.toString(customerSearchsFound.get(i).getCuCustId());
        	String filterName = customerSearchsFound.get(i).getCuFirstNameTx();
        	String filterSupplier = customerSearchsFound.get(i).getCuLastNameTx();
        	String filterBarcode = customerSearchsFound.get(i).getCuCustNumberTxN();
 
        
	        if(custId != null && !filterId.contains(custId))
	        {
	        	continue;
	        }
	        
	        if(custFirstName != null && !filterName.contains(custFirstName))
	        {
	        	continue;
	        }
	        if(custLastName != null && !filterSupplier.contains(custLastName)){
	           	continue;
	        }
	        if(custNumber != null && !filterBarcode.contains(custNumber)) {
	        	continue;
	        }
        	
	        result.add(customerSearchsFound.get(i));
        }
	        
        return result;
    }


    /**
     * @see org.apache.wicket.markup.repeater.data.IDataProvider#size()
     */
    @Override
    public long size()
    {
 
    	return filterCustomerSearchs(getCustomerDB().getIndex(getSort())).size();
    }

    /**
     * @see org.apache.wicket.markup.repeater.data.IDataProvider#model(java.lang.Object)
     */
    @Override
    public IModel<TCuCust> model(TCuCust object)
    {
        return new DetachableCustomerModel(object) {
        		private static final long serialVersionUID = 1L;
		@Override 
        protected TCuCust load() { 
			return (TCuCust) object; 
        } 
      };
    }

    @Override
    public CustomerFilter getFilterState()
    {
        return customerFilter;
    }

    @Override
    public void setFilterState(CustomerFilter state)
    {
    	customerFilter  = state;
    }

	public TCuCust getCustItem() {
		return custItem;
	}
	public TCuCust getCustItem(int id) {
		custItem = custItemDAO.getCustById(id);
		return custItem;
	}

	public void setStockItem(TCuCust custItem) {
		this.custItem = custItem;
	}
    

}

