package org.holtz.eve.view.stockitemSearch;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.wicket.extensions.markup.html.repeater.data.sort.SortOrder;
import org.apache.wicket.extensions.markup.html.repeater.data.table.filter.IFilterStateLocator;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.holtz.eve.jpa.dao.StockItemDAO;
import org.holtz.eve.jpa.dao.StoreStockItemDAO;
import org.holtz.eve.jpa.dao.impl.StockItemDAOImpl;
import org.holtz.eve.jpa.dao.impl.StoreStockItemDAOImpl;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;

public class SortableStockItemDataProvider extends SortableDataProvider<S01StockItemSearch, String> implements IFilterStateLocator<StockItemFilter>, Serializable 
{
    private StockItemFilter stockItemFilter = new StockItemFilter();
    @SpringBean
    private transient StoreStockItemDAOImpl stockItemDAO;
    List<S01StockItemSearch> stockItemList = new ArrayList<S01StockItemSearch>();
    TZlStoreStockItem stockItem = new TZlStoreStockItem();
    
    
    /**
     * constructor
     */
    public SortableStockItemDataProvider()
    {
    	stockItemDAO = new StoreStockItemDAOImpl();
    	setSort("stockItemId", SortOrder.NONE);
    	stockItemList = stockItemDAO.listAllStoreStockItem();
    	stockItemList.removeAll(Collections.singleton(null));
    }

    protected StockItemDatabase getStockItemDB()
    {
    	DatabaseLocator.getDatabase(stockItemList);
    	return new StockItemDatabase(stockItemList);
    }

    @Override
    public Iterator<? extends S01StockItemSearch> iterator(long first, long count)
    {
        List<S01StockItemSearch> stockItemSearchsFound = getStockItemDB().getIndex(getSort());
        List<S01StockItemSearch> filteredStock = filterStockItemSearchs(stockItemSearchsFound);
        if (filteredStock.size() > count)
        	return filterStockItemSearchs(stockItemSearchsFound).subList((int)first, (int)(first + count)).iterator();
        else
        	return filterStockItemSearchs(stockItemSearchsFound).subList((int)first, (int)(first + filteredStock.size())).iterator();
    }

    private List<S01StockItemSearch> filterStockItemSearchs(List<S01StockItemSearch> stockItemSearchsFound)
    {
        ArrayList<S01StockItemSearch> result = new ArrayList<>();
        String stockId = stockItemFilter.getStockItemId();
        String stockName = stockItemFilter.getStockItemName();
        String stockSupplier = stockItemFilter.getStockItemSupplier();
        String stockBarcode = stockItemFilter.getStockItemBarcode();
        for(int i = 0; i < stockItemSearchsFound.size(); i++) {
        	String filterId = Integer.toString(stockItemSearchsFound.get(i).getId().getSistockItemId());
        	String filterName = stockItemSearchsFound.get(i).getId().getSistockItemTx();
        	String filterSupplier = stockItemSearchsFound.get(i).getId().getSuSupplierTx();
        	String filterBarcode = stockItemSearchsFound.get(i).getId().getSibarcodeNoTxN();
 
        
	        if(stockId != null && !filterId.contains(stockId))
	        {
	        	continue;
	        }
	        
	        if(stockName != null && !filterName.contains(stockName))
	        {
	        	continue;
	        }
	        if(stockSupplier != null && !filterSupplier.contains(stockSupplier)){
	           	continue;
	        }
	        if(stockBarcode != null && !filterBarcode.contains(stockBarcode)) {
	        	continue;
	        }
        	
	        result.add(stockItemSearchsFound.get(i));
        }
	        
        return result;
    }


    /**
     * @see org.apache.wicket.markup.repeater.data.IDataProvider#size()
     */
    @Override
    public long size()
    {
 
    	return filterStockItemSearchs(getStockItemDB().getIndex(getSort())).size();
    }

    /**
     * @see org.apache.wicket.markup.repeater.data.IDataProvider#model(java.lang.Object)
     */
    @Override
    public IModel<S01StockItemSearch> model(S01StockItemSearch object)
    {
        return new DetachableStockItemSearchModel(object) {
        		private static final long serialVersionUID = 1L;
		@Override 
        protected S01StockItemSearch load() { 
			return (S01StockItemSearch) object; 
        } 
      };
    }

    @Override
    public StockItemFilter getFilterState()
    {
        return stockItemFilter;
    }

    @Override
    public void setFilterState(StockItemFilter state)
    {
    	stockItemFilter  = state;
    }

	public TZlStoreStockItem getStockItem() {
		return stockItem;
	}
	public TZlStoreStockItem getStockItem(int id) {
		stockItem = stockItemDAO.getStoreStockItemById(id);
		return stockItem;
	}

	public void setStockItem(TZlStoreStockItem stockItem) {
		this.stockItem = stockItem;
	}
    

}

