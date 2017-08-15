package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSistockItem;

public interface TSistockItemDAO {
	public TSistockItem getStockItemById(int id);
	public TSistockItem getStockItemByName(String name);
	public List<TSistockItem> getStockItemList();
	public void save(TSistockItem stockItem);
	public void delete(TSistockItem stockItem);
}
