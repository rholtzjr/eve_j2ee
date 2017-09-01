package org.holtz.eve.view.invoice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.sql.Timestamp;

import org.apache.wicket.extensions.markup.html.repeater.util.SortParam;
import org.holtz.eve.jpa.entity.S01InInvoice;

/**
 * simple database for stockItems
 * 
 * @author igor
 * 
 */
public class InvoiceDatabase
{
    private final Map<Integer, S01InInvoice> map = Collections.synchronizedMap(new HashMap<Integer, S01InInvoice>());
    private final List<S01InInvoice> invList = Collections.synchronizedList(new ArrayList<S01InInvoice>());
    private final List<S01InInvoice> invIdIdx = Collections.synchronizedList(new ArrayList<S01InInvoice>());
    private final List<S01InInvoice> invCreateDateIdx = Collections.synchronizedList(new ArrayList<S01InInvoice>());
    private final List<S01InInvoice> invCustIdIdx = Collections.synchronizedList(new ArrayList<S01InInvoice>());
    private final List<S01InInvoice> invNumberIdx = Collections.synchronizedList(new ArrayList<S01InInvoice>());
    private final List<S01InInvoice> invIdDescIdx = Collections.synchronizedList(new ArrayList<S01InInvoice>());
    private final List<S01InInvoice> invCreateDateDescIdx = Collections.synchronizedList(new ArrayList<S01InInvoice>());
    private final List<S01InInvoice> invCustIdDescIdx = Collections.synchronizedList(new ArrayList<S01InInvoice>());
    private final List<S01InInvoice> invNumberDescIdx = Collections.synchronizedList(new ArrayList<S01InInvoice>());

    /**
     * Constructor
     */
    public InvoiceDatabase(List<S01InInvoice> itemList, int count)
    {
        for (int i = 0; i < count; i++)
        {
        	 add(itemList.get(i));
        }
        updateIndecies();
    }
    public InvoiceDatabase(List<S01InInvoice> itemList)
    {
        
    	for(int i = 0; i < itemList.size(); i++) {
    		if(!itemList.get(i).equals(null))
    			add(itemList.get(i));
    	}
    	updateIndecies();
    }
    
    @SuppressWarnings("unchecked")
	List<S01InInvoice> getDatabase(List<S01InInvoice> list)
    {
    	return (List<S01InInvoice>) new InvoiceDatabase(list);
    }
    /**
     * find stockItem by id
     * 
     * @param id
     * @return stockItem
     */
    public S01InInvoice get(long id)
    {
    	S01InInvoice c = map.get(id);
        if (c == null)
        {
            throw new RuntimeException("invItem with id [" + id + "] not found in the database");
        }
        return c;
    }

    protected void add(final S01InInvoice invItem)
    {
        map.put(invItem.getInInvoiceID(), invItem);
        invList.add(invItem);
        invIdIdx.add(invItem);
        invCreateDateIdx.add(invItem);
        invCustIdIdx.add(invItem);
        invNumberIdx.add(invItem);
        invIdDescIdx.add(invItem);
        invCreateDateDescIdx.add(invItem);
        invCustIdDescIdx.add(invItem);
        invNumberDescIdx.add(invItem);
    }

    /**
     * select stockItems and apply sort
     * 
     * @param first
     * @param count
     * @param sort
     * @return list of stockItems
     */
    public List<S01InInvoice> find(long first, long count, SortParam<?> sort)
    {
        return getIndex(sort).subList((int)first, (int)(first + count));
    }

    public List<S01InInvoice> getIndex(SortParam<?> sort)
    {
        if (sort == null )
        {
        	return invList;
        }
        if (sort.getProperty().equals("custId")) {
        	return sort.isAscending() ? invIdIdx : invIdDescIdx;
        }

        if (sort.getProperty().equals("custFirstName"))
        {
            return sort.isAscending() ? invCreateDateIdx : invCreateDateDescIdx;
        }
        else if (sort.getProperty().equals("custLastName"))
        {
            return sort.isAscending() ? invCustIdIdx : invCustIdDescIdx;
        }
        else if ( sort.getProperty().equals("cuCustNumberTx"))
        {
        	return sort.isAscending() ? invNumberIdx : invNumberDescIdx;
        	
        }
        throw new RuntimeException("unknown sort option [" + sort +
            "]. valid fields: [Cust Id], [Cust First Name], [Cust Last Name],[Cust Number]");
    }

    /**
     * @return number of stockItems in the database
     */
    public int getCount()
    {
        return invIdIdx.size();
    }

    /**
     * add stockItem to the database
     * 
     * @param stockItem
     */
    public void save(final S01InInvoice invItem)
    {
        if (invItem.getInInvoiceID() != 0)
        {
        //    stockItem.setId(S01InInvoiceGenerator.getInstance().generateId());
            add(invItem);
            updateIndecies();
        }
        else
        {
            throw new IllegalArgumentException("stockItem [" + invItem.getInInvoiceID() +
                "] is already persistent");
        }
    }

    /**
     * delete stockItem from the database
     * 
     * @param stockItem
     */
    public void delete(final S01InInvoice invItem)
    {
        map.remove(invItem.getInInvoiceID());
        invList.remove(invItem);
        invIdIdx.remove(invItem);
        invCreateDateIdx.remove(invItem);
        invCustIdIdx.remove(invItem);
        invNumberIdx.remove(invItem);
        invIdDescIdx.remove(invItem);
        invCreateDateDescIdx.remove(invItem);
        invCustIdDescIdx.remove(invItem);
        invNumberIdx.remove(invItem);

        invItem.setInInvoiceID(0);
    }

    
    private void updateIndecies()
    {
        Collections.sort(invIdIdx, new Comparator<S01InInvoice>()
        {
            public int compare(S01InInvoice arg0, S01InInvoice arg1)
            {
                return  (arg0).getInInvoiceID() - (arg1).getInInvoiceID();
            }
        });

        Collections.sort(invCreateDateIdx, new Comparator<S01InInvoice>()
        {
            public int compare(S01InInvoice arg0, S01InInvoice arg1)
            {
                return ((Timestamp) (arg0).getInCreationDate()).compareTo((Timestamp) (arg1).getInCreationDate());
            }
        });

        Collections.sort(invCustIdIdx, new Comparator<S01InInvoice>()
        {
            public int compare(S01InInvoice arg0, S01InInvoice arg1)
            {
                return ((Integer) (arg0).getInCustID()).compareTo((Integer) (arg1).getInCustID());
            }
        });

        Collections.sort(invNumberIdx, new Comparator<S01InInvoice>()
        {
            public int compare(S01InInvoice arg0, S01InInvoice arg1)
            {
            	if((arg0).getInInvoiceNumberTx_N() == null)
                	(arg0).setInInvoiceNumberTx_N("");
                if((arg1).getInInvoiceNumberTx_N() == null)
        			(arg1).setInInvoiceNumberTx_N("");
            	return ((String) (arg0).getInInvoiceNumberTx_N()).compareTo((String) (arg1).getInInvoiceNumberTx_N());
            }
        });
        
        Collections.sort(invIdDescIdx, new Comparator<S01InInvoice>()
        {
            public int compare(S01InInvoice arg0, S01InInvoice arg1)
            {
                return Integer.toString( (arg1).getInInvoiceID()).compareTo(Integer.toString((arg0).getInInvoiceID()));
            }
        });

        Collections.sort(invCreateDateDescIdx, new Comparator<S01InInvoice>()
        {
            public int compare(S01InInvoice arg0, S01InInvoice arg1)
            {
                return ((Timestamp) (arg1).getInCreationDate()).compareTo((Timestamp) (arg0).getInCreationDate());
            }
        });

        Collections.sort(invCustIdDescIdx, new Comparator<S01InInvoice>()
        {
            public int compare(S01InInvoice arg0, S01InInvoice arg1)
            {
                return ((Integer) (arg1).getInCustID()).compareTo((Integer) (arg0).getInCustID());
            }
        });

        Collections.sort(invNumberDescIdx, new Comparator<S01InInvoice>()
        {
            public int compare(S01InInvoice arg0, S01InInvoice arg1)
            {
            	if((arg0).getInInvoiceNumberTx_N() == null)
                	(arg0).setInInvoiceNumberTx_N("");
                if((arg1).getInInvoiceNumberTx_N() == null)
        			(arg1).setInInvoiceNumberTx_N("");
            	return ((String) (arg1).getInInvoiceNumberTx_N()).compareTo((String) (arg0).getInInvoiceNumberTx_N());
            }
        });

    }

}