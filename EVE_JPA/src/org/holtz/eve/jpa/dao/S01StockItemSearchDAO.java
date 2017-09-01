package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.S01StockItemSearch;

public interface S01StockItemSearchDAO {
	public S01StockItemSearch getStockItemSearchById(int id);
	public S01StockItemSearch getStockItemSearchByName(String name);
	public List<S01StockItemSearch> getStockItemSearchList();
	public void save(S01StockItemSearch stockItemSearch);
	public void delete(S01StockItemSearch stockItemSearch);
	
}
