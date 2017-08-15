package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSkSupplierStockItem;

public interface TSkSupplierStockItemDAO {

	public TSkSupplierStockItem getSupplierStockItemById(int id);
	public TSkSupplierStockItem getSupplierStockItemByName(String name);
	public List<TSkSupplierStockItem> getSupplierStockItemList();
	public void save(TSkSupplierStockItem supplierStockItem);
	public void delete(TSkSupplierStockItem supplierStockItem);
}
