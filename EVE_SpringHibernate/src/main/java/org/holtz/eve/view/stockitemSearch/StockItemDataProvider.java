package org.holtz.eve.view.stockitemSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.holtz.eve.jpa.dao.impl.StoreStockItemDAOImpl;
import org.holtz.eve.jpa.entity.S01StockItemSearch;


public class StockItemDataProvider extends SortableStockItemDataProvider {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 
	 */
	
	
	 private List<S01StockItemSearch> list = new ArrayList<S01StockItemSearch>();
	 private StoreStockItemDAOImpl stockItemDAO = new StoreStockItemDAOImpl();
	 public StockItemDataProvider() {

		 list = stockItemDAO.listAllStoreStockItem();
		 list.removeAll(Collections.singleton(null));		 

	 }
	

	public long size() {
		
		return list.size();
	}


	public Iterator<? extends S01StockItemSearch> iterator(long first, long count) {
	    Iterator<S01StockItemSearch> iterator = list.iterator();
	        return iterator;
		
	}

//	   public IModel<S01StockItemSearch> model(Object object) { 
//		      return new LoadableDetachableModel<S01StockItemSearch>() { 
//				private static final long serialVersionUID = 1L;
//				@Override 
//		        protected S01StockItemSearch load() { 
//					return (S01StockItemSearch) object; 
//		        } 
//		      }; 
//		    }

	@Override
	public void detach() {
		
		
	}


}

	
