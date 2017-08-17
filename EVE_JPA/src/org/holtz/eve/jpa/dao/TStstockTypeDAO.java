package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TStstockType;

public interface TStstockTypeDAO {
	public TStstockType getStockTypeById(int id);
	public TStstockType getStockTypeByName(String name);
	public List<TStstockType> getStockTypeList();
	public void save(TStstockType stockType);
	public void delete(TStstockType stockType);
}
