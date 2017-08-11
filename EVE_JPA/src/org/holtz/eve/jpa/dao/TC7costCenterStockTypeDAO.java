package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TC7costCenterStockType;

public interface TC7costCenterStockTypeDAO {
	public TC7costCenterStockType getCostCenterStockTypeById(int id);
	public TC7costCenterStockType getCostCenterStockTypeByName(String name);
	public List<TC7costCenterStockType> getCostCenterStockTypeList();
	public void save(TC7costCenterStockType ccst);
	public void delete(TC7costCenterStockType ccst);
}
