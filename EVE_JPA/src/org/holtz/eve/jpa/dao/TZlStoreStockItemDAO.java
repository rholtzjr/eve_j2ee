package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TZlStoreStockItem;

public interface TZlStoreStockItemDAO {
	public TZlStoreStockItem getStoreStockItemById(int id);
	public TZlStoreStockItem getStoreStockItemByName(String name);
	public List<TZlStoreStockItem> getStoreStockItemList();
	public void save(TZlStoreStockItem storeStockItem);
	public void delete(TZlStoreStockItem storeStockItem);
}
