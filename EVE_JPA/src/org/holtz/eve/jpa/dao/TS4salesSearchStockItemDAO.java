package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TS4salesSearchStockItem;

public interface TS4salesSearchStockItemDAO {
	public TS4salesSearchStockItem getSalesSearchStockItemById(int id);
	public TS4salesSearchStockItem getSalesSearchStockItemByName(String name);
	public List<TS4salesSearchStockItem> getSalesSearchStockItemList();
	public void save(TS4salesSearchStockItem salesSearchStockItem);
	public void delete(TS4salesSearchStockItem salesSearchStockItem);
}
