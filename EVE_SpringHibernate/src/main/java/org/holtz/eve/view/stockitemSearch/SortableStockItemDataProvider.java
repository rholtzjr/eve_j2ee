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
import org.holtz.eve.jpa.dao.S01StockItemSearchDAO;
import org.holtz.eve.jpa.dao.StockItemDAO;
import org.holtz.eve.jpa.dao.StoreStockItemDAO;
import org.holtz.eve.jpa.dao.TZlStoreStockItemDAO;
import org.holtz.eve.jpa.dao.impl.S01StockItemSearchDAOImpl;
import org.holtz.eve.jpa.dao.impl.StockItemDAOImpl;
import org.holtz.eve.jpa.dao.impl.StoreStockItemDAOImpl;
import org.holtz.eve.jpa.dao.impl.TZlStoreStockItemDAOImpl;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;
import org.holtz.eve.view.DatabaseLocator;

public class SortableStockItemDataProvider extends SortableDataProvider<S01StockItemSearch, String> implements IFilterStateLocator<StockItemFilter>, Serializable 
{
    private StockItemFilter stockItemFilter = new StockItemFilter();
    private transient S01StockItemSearchDAO stockItemDAO;
    private List<S01StockItemSearch> stockItemList = new ArrayList<S01StockItemSearch>();
    private TZlStoreStockItem storeStockItem = new TZlStoreStockItem();
    private transient TZlStoreStockItemDAO storeStockItemDAO;
    
    /**
     * constructor
     */
    public SortableStockItemDataProvider()
    {
    	stockItemDAO = new S01StockItemSearchDAOImpl();
    	setSort("stockItemId", SortOrder.NONE);
    	stockItemList = stockItemDAO.getStockItemSearchList();
    	stockItemList.removeAll(Collections.singleton(null));
    }

    protected StockItemDatabase getStockItemDB()
    {
    	return DatabaseLocator.getStockItemDatabase(stockItemList);
    	//return new StockItemDatabase(stockItemList);
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
        	String filterId = Integer.toString(stockItemSearchsFound.get(i).getSIStockItemID());
        	String filterName = stockItemSearchsFound.get(i).getSIStockItemTx();
        	String filterSupplier = stockItemSearchsFound.get(i).getSuSupplierTx();
        	String filterBarcode = stockItemSearchsFound.get(i).getSIBarcodeNoTx_N();
 
        
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
		return storeStockItem;
	}
	public TZlStoreStockItem getStockItem(int id) {
		storeStockItemDAO = new TZlStoreStockItemDAOImpl();
		storeStockItem = storeStockItemDAO.getStoreStockItemById(id);
		return storeStockItem;
	}

	public void setStockItem(TZlStoreStockItem stockItem) {
		this.storeStockItem = stockItem;
	}
    

}

