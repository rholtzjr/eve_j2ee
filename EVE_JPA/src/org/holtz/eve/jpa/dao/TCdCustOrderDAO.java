package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCdCustOrder;

public interface TCdCustOrderDAO {
	public TCdCustOrder getCustOrderById(int id);
	public TCdCustOrder getCustOrderByName(String name);
	public List<TCdCustOrder> getCustOrderList();
	public void save(TCdCustOrder custOrder);
	public void delete(TCdCustOrder custOrder);

}
