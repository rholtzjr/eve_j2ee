package org.holtz.eve.view.stockitemSearch;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.wicket.extensions.markup.html.repeater.util.SortParam;
import org.holtz.eve.jpa.entity.S01StockItemSearch;

/**
 * simple database for stockItems
 * 
 * @author igor
 * 
 */
public class StockItemDatabase
{
    private final Map<Integer, S01StockItemSearch> map = Collections.synchronizedMap(new HashMap<Integer, S01StockItemSearch>());
    private final List<S01StockItemSearch> stockItemIdIdx = Collections.synchronizedList(new ArrayList<S01StockItemSearch>());
    private final List<S01StockItemSearch> stockItemNameIdx = Collections.synchronizedList(new ArrayList<S01StockItemSearch>());
    private final List<S01StockItemSearch> stockItemSupplierIdx = Collections.synchronizedList(new ArrayList<S01StockItemSearch>());
    private final List<S01StockItemSearch> stockItemBarcodeIdx = Collections.synchronizedList(new ArrayList<S01StockItemSearch>());

    /**
     * Constructor
     */
    public StockItemDatabase(List<S01StockItemSearch> itemList, int count)
    {
        for (int i = 0; i < count; i++)
        {
            //  This will be the DAO call to populate the data from the database view
        	 add(itemList.get(i));
        }
        updateIndecies();
    }
    public StockItemDatabase(List<S01StockItemSearch> itemList)
    {
        
    	for(int i = 0; i < itemList.size(); i++) {
    		if(!itemList.get(i).equals(null))
    			add(itemList.get(i));
    	}
    	updateIndecies();
    }
    
    @SuppressWarnings("unchecked")
	List<S01StockItemSearch> getDatabase(List<S01StockItemSearch> list)
    {
    	return (List<S01StockItemSearch>) new StockItemDatabase(list);
    }
    /**
     * find stockItem by id
     * 
     * @param id
     * @return stockItem
     */
    public S01StockItemSearch get(long id)
    {
    	S01StockItemSearch c = map.get(id);
        if (c == null)
        {
            throw new RuntimeException("stockItem with id [" + id + "] not found in the database");
        }
        return c;
    }

    protected void add(final S01StockItemSearch stockItem)
    {
        map.put(stockItem.getId().getSistockItemId(), stockItem);
        stockItemIdIdx.add(stockItem);
        stockItemNameIdx.add(stockItem);
        stockItemSupplierIdx.add(stockItem);
        stockItemBarcodeIdx.add(stockItem);
    }

    /**
     * select stockItems and apply sort
     * 
     * @param first
     * @param count
     * @param sort
     * @return list of stockItems
     */
    public List<S01StockItemSearch> find(long first, long count, SortParam sort)
    {
        return getIndex(sort).subList((int)first, (int)(first + count));
    }

    public List<S01StockItemSearch> getIndex(SortParam<?> sort)
    {
        if (sort == null || sort.getProperty().equals("stockItemId"))
        {
            return stockItemIdIdx;
        }

        if (sort.getProperty().equals("stockItemName"))
        {
            return sort.isAscending() ? stockItemNameIdx : stockItemIdIdx;
        }
        else if (sort.getProperty().equals("supplier"))
        {
            return sort.isAscending() ? stockItemSupplierIdx : stockItemIdIdx;
        }
        else if ( sort.getProperty().equals("barcode"))
        {
        	return sort.isAscending() ? stockItemBarcodeIdx : stockItemIdIdx;
        	
        }
        throw new RuntimeException("unknown sort option [" + sort +
            "]. valid fields: [Stock Item Id], [Stock Item Name], [Supplier],[Barcode]");
    }

    /**
     * @return number of stockItems in the database
     */
    public int getCount()
    {
        return stockItemIdIdx.size();
    }

    /**
     * add stockItem to the database
     * 
     * @param stockItem
     */
    public void save(final S01StockItemSearch stockItem)
    {
        if (stockItem.getId().getSistockItemId() != 0)
        {
        //    stockItem.setId(S01StockItemSearchGenerator.getInstance().generateId());
            add(stockItem);
            updateIndecies();
        }
        else
        {
            throw new IllegalArgumentException("stockItem [" + stockItem.getId().getSistockItemId() +
                "] is already persistent");
        }
    }

    /**
     * delete stockItem from the database
     * 
     * @param stockItem
     */
    public void delete(final S01StockItemSearch stockItem)
    {
        map.remove(stockItem.getId());

        stockItemIdIdx.remove(stockItem);
        stockItemNameIdx.remove(stockItem);
        stockItemSupplierIdx.remove(stockItem);
        stockItemBarcodeIdx.remove(stockItem);

        stockItem.getId().setSistockItemId(0);
    }

    
    private void updateIndecies()
    {
        Collections.sort(stockItemIdIdx, new Comparator<S01StockItemSearch>()
        {
            public int compare(S01StockItemSearch arg0, S01StockItemSearch arg1)
            {
                return Integer.toString( (arg0).getId().getSistockItemId()).compareTo(Integer.toString((arg1).getId().getSistockItemId()));
            }
        });

        Collections.sort(stockItemNameIdx, new Comparator<S01StockItemSearch>()
        {
            public int compare(S01StockItemSearch arg0, S01StockItemSearch arg1)
            {
                return (arg0).getId().getSistockItemTx().compareTo((arg1).getId().getSistockItemTx());
            }
        });

        Collections.sort(stockItemSupplierIdx, new Comparator<S01StockItemSearch>()
        {
            public int compare(S01StockItemSearch arg0, S01StockItemSearch arg1)
            {
                return (arg1).getId().getSuSupplierTx().compareTo((arg0).getId().getSuSupplierTx());
            }
        });

        Collections.sort(stockItemBarcodeIdx, new Comparator<S01StockItemSearch>()
        {
            public int compare(S01StockItemSearch arg0, S01StockItemSearch arg1)
            {
                return (arg1).getId().getSibarcodeNoTxN().compareTo((arg0).getId().getSibarcodeNoTxN());
            }
        });

    }

}