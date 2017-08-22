package org.holtz.eve.view.customer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.wicket.extensions.markup.html.repeater.util.SortParam;
import org.holtz.eve.jpa.entity.TCuCust;

/**
 * simple database for stockItems
 * 
 * @author igor
 * 
 */
public class CustomerDatabase
{
    private final Map<Integer, TCuCust> map = Collections.synchronizedMap(new HashMap<Integer, TCuCust>());
    private final List<TCuCust> custIdIdx = Collections.synchronizedList(new ArrayList<TCuCust>());
    private final List<TCuCust> custFirstNameIdx = Collections.synchronizedList(new ArrayList<TCuCust>());
    private final List<TCuCust> custLastNameIdx = Collections.synchronizedList(new ArrayList<TCuCust>());
    private final List<TCuCust> custNumberIdx = Collections.synchronizedList(new ArrayList<TCuCust>());

    /**
     * Constructor
     */
    public CustomerDatabase(List<TCuCust> itemList, int count)
    {
        for (int i = 0; i < count; i++)
        {
            //  This will be the DAO call to populate the data from the database view
        	 add(itemList.get(i));
        }
        updateIndecies();
    }
    public CustomerDatabase(List<TCuCust> itemList)
    {
        
    	for(int i = 0; i < itemList.size(); i++) {
    		if(!itemList.get(i).equals(null))
    			add(itemList.get(i));
    	}
    	updateIndecies();
    }
    
    @SuppressWarnings("unchecked")
	List<TCuCust> getDatabase(List<TCuCust> list)
    {
    	return (List<TCuCust>) new CustomerDatabase(list);
    }
    /**
     * find stockItem by id
     * 
     * @param id
     * @return stockItem
     */
    public TCuCust get(long id)
    {
    	TCuCust c = map.get(id);
        if (c == null)
        {
            throw new RuntimeException("stockItem with id [" + id + "] not found in the database");
        }
        return c;
    }

    protected void add(final TCuCust custItem)
    {
        map.put(custItem.getCuCustId(), custItem);
        custIdIdx.add(custItem);
        custFirstNameIdx.add(custItem);
        custLastNameIdx.add(custItem);
        custNumberIdx.add(custItem);
    }

    /**
     * select stockItems and apply sort
     * 
     * @param first
     * @param count
     * @param sort
     * @return list of stockItems
     */
    public List<TCuCust> find(long first, long count, SortParam sort)
    {
        return getIndex(sort).subList((int)first, (int)(first + count));
    }

    public List<TCuCust> getIndex(SortParam<?> sort)
    {
        if (sort == null || sort.getProperty().equals("custId"))
        {
            return custIdIdx;
        }

        if (sort.getProperty().equals("custFistName"))
        {
            return sort.isAscending() ? custFirstNameIdx : custIdIdx;
        }
        else if (sort.getProperty().equals("custLastName"))
        {
            return sort.isAscending() ? custLastNameIdx : custIdIdx;
        }
        else if ( sort.getProperty().equals("barcode"))
        {
        	return sort.isAscending() ? custNumberIdx : custIdIdx;
        	
        }
        throw new RuntimeException("unknown sort option [" + sort +
            "]. valid fields: [Cust Id], [Cust First Name], [Cust Last Name],[Cust Number]");
    }

    /**
     * @return number of stockItems in the database
     */
    public int getCount()
    {
        return custIdIdx.size();
    }

    /**
     * add stockItem to the database
     * 
     * @param stockItem
     */
    public void save(final TCuCust custItem)
    {
        if (custItem.getCuCustId() != 0)
        {
        //    stockItem.setId(TCuCustGenerator.getInstance().generateId());
            add(custItem);
            updateIndecies();
        }
        else
        {
            throw new IllegalArgumentException("stockItem [" + custItem.getCuCustId() +
                "] is already persistent");
        }
    }

    /**
     * delete stockItem from the database
     * 
     * @param stockItem
     */
    public void delete(final TCuCust custItem)
    {
        map.remove(custItem.getCuCustId());

        custIdIdx.remove(custItem);
        custFirstNameIdx.remove(custItem);
        custLastNameIdx.remove(custItem);
        custNumberIdx.remove(custItem);

        custItem.setCuCustId(0);
    }

    
    private void updateIndecies()
    {
        Collections.sort(custIdIdx, new Comparator<TCuCust>()
        {
            public int compare(TCuCust arg0, TCuCust arg1)
            {
                return Integer.toString( (arg0).getCuCustId()).compareTo(Integer.toString((arg1).getCuCustId()));
            }
        });

        Collections.sort(custFirstNameIdx, new Comparator<TCuCust>()
        {
            public int compare(TCuCust arg0, TCuCust arg1)
            {
                return (arg0).getCuFirstNameTx().compareTo((arg1).getCuFirstNameTx());
            }
        });

        Collections.sort(custLastNameIdx, new Comparator<TCuCust>()
        {
            public int compare(TCuCust arg0, TCuCust arg1)
            {
                return (arg1).getCuLastNameTx().compareTo((arg0).getCuLastNameTx());
            }
        });

        Collections.sort(custNumberIdx, new Comparator<TCuCust>()
        {
            public int compare(TCuCust arg0, TCuCust arg1)
            {
                return (arg1).getCuCustNumberTxN().compareTo((arg0).getCuCustNumberTxN());
            }
        });

    }

}