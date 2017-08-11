package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.S01StockItemSearchId;
import org.holtz.eve.jpa.entity.TZlStoreStockItem;

public interface StoreStockItemDAO {
	public void saveStoreStockItem(TZlStoreStockItem storeStockItem) ;
	public List<S01StockItemSearch> listAllStoreStockItem() ;
	public List<S01StockItemSearch> listStoreStockItemByName(String param);
	public TZlStoreStockItem getStoreStockItemById(int id);
}
