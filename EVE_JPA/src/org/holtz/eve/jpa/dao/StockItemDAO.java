package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.S01SistockItem;
import org.holtz.eve.jpa.entity.S01StockItemSearch;
import org.holtz.eve.jpa.entity.TSistockItem;

public interface StockItemDAO {
	
	public void saveStockItem(TSistockItem stockItem) ;
	public List<S01StockItemSearch> getStockItemList() ;
	public List<S01SistockItem> getStockItemById(int id);

}
