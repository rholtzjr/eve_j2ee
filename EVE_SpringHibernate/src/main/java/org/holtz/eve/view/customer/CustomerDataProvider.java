package org.holtz.eve.view.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.holtz.eve.jpa.dao.CustomerDAO;
import org.holtz.eve.jpa.dao.impl.CustomerDAOImpl;
import org.holtz.eve.jpa.dao.impl.StoreStockItemDAOImpl;
import org.holtz.eve.jpa.entity.TCuCust;


public class CustomerDataProvider extends SortableCustomerDataProvider {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 
	 */
	
	
	 private List<TCuCust> list = new ArrayList<TCuCust>();
	 private CustomerDAO custItemDAO = new CustomerDAOImpl();
	 public CustomerDataProvider() {

		 list = custItemDAO.getCustList();
		 list.removeAll(Collections.singleton(null));		 

	 }
	

	public long size() {
		
		return list.size();
	}


	public Iterator<? extends TCuCust> iterator(long first, long count) {
	    Iterator<TCuCust> iterator = list.iterator();
	        return iterator;
		
	}

//	   public IModel<TCuCust> model(Object object) { 
//		      return new LoadableDetachableModel<TCuCust>() { 
//				private static final long serialVersionUID = 1L;
//				@Override 
//		        protected TCuCust load() { 
//					return (TCuCust) object; 
//		        } 
//		      }; 
//		    }

	@Override
	public void detach() {
		
		
	}


}

	
