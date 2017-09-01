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
import org.holtz.eve.jpa.dao.S01CuCustDAO;
import org.holtz.eve.jpa.dao.impl.S01CuCustDAOImpl;
import org.holtz.eve.jpa.entity.S01CuCust;
import org.holtz.eve.view.DatabaseLocator;

public class SortableCustomerDataProvider extends SortableDataProvider<S01CuCust, String> implements IFilterStateLocator<CustomerFilter>, Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomerFilter customerFilter = new CustomerFilter();
    @SpringBean
    private transient S01CuCustDAO custItemDAO;
    private List<S01CuCust> custItemList = new ArrayList<S01CuCust>();
    private S01CuCust custItem = new S01CuCust();
    
    
    /**
     * constructor
     */
    public SortableCustomerDataProvider()
    {
    	custItemDAO = new S01CuCustDAOImpl();
    	setSort("custId", SortOrder.NONE);
    	custItemList = custItemDAO.getCuCustList();
    	custItemList.removeAll(Collections.singleton(null));
    }

    protected CustomerDatabase getCustomerDB()
    {
    	DatabaseLocator.getCustomerDatabase(custItemList);
    	return new CustomerDatabase(custItemList);
    }

    @Override
    public Iterator<? extends S01CuCust> iterator(long first, long count)
    {
        List<S01CuCust> customerSearchsFound = getCustomerDB().getIndex(getSort());
        List<S01CuCust> filteredCustomer = filterCustomerSearchs(customerSearchsFound);
        if (filteredCustomer.size() > count)
        	return filterCustomerSearchs(customerSearchsFound).subList((int)first, (int)(first + count)).iterator();
        else
        	return filterCustomerSearchs(customerSearchsFound).subList((int)first, (int)(first + filteredCustomer.size())).iterator();
    }

    private List<S01CuCust> filterCustomerSearchs(List<S01CuCust> customerSearchsFound)
    {
        ArrayList<S01CuCust> result = new ArrayList<>();
        String custId = customerFilter.getCustId();
        String custFirstName = customerFilter.getCustFirstName();
        String custLastName = customerFilter.getCustLastName();
        String custNumber = customerFilter.getCustNumber();
        for(int i = 0; i < customerSearchsFound.size(); i++) {
        	String filterId = Integer.toString(customerSearchsFound.get(i).getCuCustID());
        	String filterFirstName = (String) customerSearchsFound.get(i).getCuFirstNameTx();
        	String filterLastName = (String) customerSearchsFound.get(i).getCuLastNameTx();
        	String filterCustNumber = (String) customerSearchsFound.get(i).getCuCustNumberTx_N();
 
        
	        if(custId != null && !filterId.contains(custId))
	        {
	        	continue;
	        }
	        
	        if(custFirstName != null && !filterFirstName.contains(custFirstName))
	        {
	        	continue;
	        }
	        if(custLastName != null && !filterLastName.contains(custLastName)){
	           	continue;
	        }
	        if(custNumber != null && !filterCustNumber.contains(custNumber)) {
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
    public IModel<S01CuCust> model(S01CuCust object)
    {
        return new DetachableCustomerModel(object) {
        		private static final long serialVersionUID = 1L;
		@Override 
        protected S01CuCust load() { 
			return (S01CuCust) object; 
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

	public S01CuCust getCustItem() {
		return custItem;
	}
	public S01CuCust getCustItem(int id) {
		custItem = custItemDAO.getCuCustById(id);
		return custItem;
	}

	public void setCustItem(S01CuCust custItem) {
		this.custItem = custItem;
	}
    

}

