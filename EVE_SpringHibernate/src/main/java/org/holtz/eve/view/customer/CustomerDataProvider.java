package org.holtz.eve.view.customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.holtz.eve.jpa.dao.S01CuCustDAO;
import org.holtz.eve.jpa.dao.impl.S01CuCustDAOImpl;
import org.holtz.eve.jpa.entity.S01CuCust;


public class CustomerDataProvider extends SortableCustomerDataProvider {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 
	 */
	
	
	 private List<S01CuCust> list = new ArrayList<S01CuCust>();
	 private S01CuCustDAO custItemDAO = new S01CuCustDAOImpl();
	 public CustomerDataProvider() {

		 list = custItemDAO.getCuCustList();
		 list.removeAll(Collections.singleton(null));		 

	 }
	

	public long size() {
		
		return list.size();
	}


	public Iterator<? extends S01CuCust> iterator(long first, long count) {
	    Iterator<S01CuCust> iterator = list.iterator();
	        return iterator;
		
	}

//	   public IModel<S01CuCust> model(Object object) { 
//		      return new LoadableDetachableModel<S01CuCust>() { 
//				private static final long serialVersionUID = 1L;
//				@Override 
//		        protected S01CuCust load() { 
//					return (S01CuCust) object; 
//		        } 
//		      }; 
//		    }

	@Override
	public void detach() {
		
		
	}


}

	
