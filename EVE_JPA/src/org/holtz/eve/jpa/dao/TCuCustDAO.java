package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCuCust;

public interface TCuCustDAO {
	public TCuCust getCustById(int id);
	public TCuCust getCustByName(String name);
	public List<TCuCust> getCustList();
	public void save(TCuCust cust);
	public void delete(TCuCust cust);
}
