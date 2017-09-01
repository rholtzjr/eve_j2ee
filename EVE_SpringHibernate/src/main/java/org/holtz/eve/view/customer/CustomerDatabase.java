package org.holtz.eve.view.customer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.wicket.extensions.markup.html.repeater.util.SortParam;
import org.holtz.eve.jpa.entity.S01CuCust;

/**
 * simple database for stockItems
 * 
 * @author igor
 * 
 */
public class CustomerDatabase
{
    private final Map<Integer, S01CuCust> map = Collections.synchronizedMap(new HashMap<Integer, S01CuCust>());
    private final List<S01CuCust> custList = Collections.synchronizedList(new ArrayList<S01CuCust>());
    private final List<S01CuCust> custIdIdx = Collections.synchronizedList(new ArrayList<S01CuCust>());
    private final List<S01CuCust> custFirstNameIdx = Collections.synchronizedList(new ArrayList<S01CuCust>());
    private final List<S01CuCust> custLastNameIdx = Collections.synchronizedList(new ArrayList<S01CuCust>());
    private final List<S01CuCust> custNumberIdx = Collections.synchronizedList(new ArrayList<S01CuCust>());
    private final List<S01CuCust> custIdDescIdx = Collections.synchronizedList(new ArrayList<S01CuCust>());
    private final List<S01CuCust> custFirstNameDescIdx = Collections.synchronizedList(new ArrayList<S01CuCust>());
    private final List<S01CuCust> custLastNameDescIdx = Collections.synchronizedList(new ArrayList<S01CuCust>());
    private final List<S01CuCust> custNumberDescIdx = Collections.synchronizedList(new ArrayList<S01CuCust>());

    /**
     * Constructor
     */
    public CustomerDatabase(List<S01CuCust> itemList, int count)
    {
        for (int i = 0; i < count; i++)
        {
        	 add(itemList.get(i));
        }
        updateIndecies();
    }
    public CustomerDatabase(List<S01CuCust> itemList)
    {
        
    	for(int i = 0; i < itemList.size(); i++) {
    		if(!itemList.get(i).equals(null))
    			add(itemList.get(i));
    	}
    	updateIndecies();
    }
    
    @SuppressWarnings("unchecked")
	List<S01CuCust> getDatabase(List<S01CuCust> list)
    {
    	return (List<S01CuCust>) new CustomerDatabase(list);
    }
    /**
     * find stockItem by id
     * 
     * @param id
     * @return stockItem
     */
    public S01CuCust get(long id)
    {
    	S01CuCust c = map.get(id);
        if (c == null)
        {
            throw new RuntimeException("custItem with id [" + id + "] not found in the database");
        }
        return c;
    }

    protected void add(final S01CuCust custItem)
    {
        map.put(custItem.getCuCustID(), custItem);
        custList.add(custItem);
        custIdIdx.add(custItem);
        custFirstNameIdx.add(custItem);
        custLastNameIdx.add(custItem);
        custNumberIdx.add(custItem);
        custIdDescIdx.add(custItem);
        custFirstNameDescIdx.add(custItem);
        custLastNameDescIdx.add(custItem);
        custNumberDescIdx.add(custItem);
    }

    /**
     * select stockItems and apply sort
     * 
     * @param first
     * @param count
     * @param sort
     * @return list of stockItems
     */
    public List<S01CuCust> find(long first, long count, SortParam<?> sort)
    {
        return getIndex(sort).subList((int)first, (int)(first + count));
    }

    public List<S01CuCust> getIndex(SortParam<?> sort)
    {
        if (sort == null )
        {
        	return custList;
        }
        if (sort.getProperty().equals("custId")) {
        	return sort.isAscending() ? custIdIdx : custIdDescIdx;
        }

        if (sort.getProperty().equals("custFirstName"))
        {
            return sort.isAscending() ? custFirstNameIdx : custFirstNameDescIdx;
        }
        else if (sort.getProperty().equals("custLastName"))
        {
            return sort.isAscending() ? custLastNameIdx : custLastNameDescIdx;
        }
        else if ( sort.getProperty().equals("cuCustNumberTx"))
        {
        	return sort.isAscending() ? custNumberIdx : custNumberDescIdx;
        	
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
    public void save(final S01CuCust custItem)
    {
        if (custItem.getCuCustID() != 0)
        {
        //    stockItem.setId(S01CuCustGenerator.getInstance().generateId());
            add(custItem);
            updateIndecies();
        }
        else
        {
            throw new IllegalArgumentException("stockItem [" + custItem.getCuCustID() +
                "] is already persistent");
        }
    }

    /**
     * delete stockItem from the database
     * 
     * @param stockItem
     */
    public void delete(final S01CuCust custItem)
    {
        map.remove(custItem.getCuCustID());
        custList.remove(custItem);
        custIdIdx.remove(custItem);
        custFirstNameIdx.remove(custItem);
        custLastNameIdx.remove(custItem);
        custNumberIdx.remove(custItem);
        custIdDescIdx.remove(custItem);
        custFirstNameDescIdx.remove(custItem);
        custLastNameDescIdx.remove(custItem);
        custNumberIdx.remove(custItem);

        custItem.setCuCustID(0);
    }

    
    private void updateIndecies()
    {
        Collections.sort(custIdIdx, new Comparator<S01CuCust>()
        {
            public int compare(S01CuCust arg0, S01CuCust arg1)
            {
                return  (arg0).getCuCustID() - (arg1).getCuCustID();
            }
        });

        Collections.sort(custFirstNameIdx, new Comparator<S01CuCust>()
        {
            public int compare(S01CuCust arg0, S01CuCust arg1)
            {
                return ((String) (arg0).getCuFirstNameTx()).compareTo((String) (arg1).getCuFirstNameTx());
            }
        });

        Collections.sort(custLastNameIdx, new Comparator<S01CuCust>()
        {
            public int compare(S01CuCust arg0, S01CuCust arg1)
            {
                return ((String) (arg0).getCuLastNameTx()).compareTo((String) (arg1).getCuLastNameTx());
            }
        });

        Collections.sort(custNumberIdx, new Comparator<S01CuCust>()
        {
            public int compare(S01CuCust arg0, S01CuCust arg1)
            {
            	if((arg0).getCuCustNumberTx_N() == null)
                	(arg0).setCuCustNumberTx_N("");
                if((arg1).getCuCustNumberTx_N() == null)
        			(arg1).setCuCustNumberTx_N("");
            	return ((String) (arg0).getCuCustNumberTx_N()).compareTo((String) (arg1).getCuCustNumberTx_N());
            }
        });
        
        Collections.sort(custIdDescIdx, new Comparator<S01CuCust>()
        {
            public int compare(S01CuCust arg0, S01CuCust arg1)
            {
                return Integer.toString( (arg1).getCuCustID()).compareTo(Integer.toString((arg0).getCuCustID()));
            }
        });

        Collections.sort(custFirstNameDescIdx, new Comparator<S01CuCust>()
        {
            public int compare(S01CuCust arg0, S01CuCust arg1)
            {
                return ((String) (arg1).getCuFirstNameTx()).compareTo((String) (arg0).getCuFirstNameTx());
            }
        });

        Collections.sort(custLastNameDescIdx, new Comparator<S01CuCust>()
        {
            public int compare(S01CuCust arg0, S01CuCust arg1)
            {
                return ((String) (arg1).getCuLastNameTx()).compareTo((String) (arg0).getCuLastNameTx());
            }
        });

        Collections.sort(custNumberDescIdx, new Comparator<S01CuCust>()
        {
            public int compare(S01CuCust arg0, S01CuCust arg1)
            {
            	if((arg0).getCuCustNumberTx_N() == null)
                	(arg0).setCuCustNumberTx_N("");
                if((arg1).getCuCustNumberTx_N() == null)
        			(arg1).setCuCustNumberTx_N("");
            	return ((String) (arg1).getCuCustNumberTx_N()).compareTo((String) (arg0).getCuCustNumberTx_N());
            }
        });

    }

}