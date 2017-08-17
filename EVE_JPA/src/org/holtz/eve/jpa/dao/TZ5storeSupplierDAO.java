package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TZ5storeSupplier;

public interface TZ5storeSupplierDAO {
	public TZ5storeSupplier getStoreSupplierById(int id);
	public TZ5storeSupplier getStoreSupplierByName(String name);
	public List<TZ5storeSupplier> getStoreSupplierList();
	public void save(TZ5storeSupplier storeSupplier);
	public void delete(TZ5storeSupplier storeSupplier);
}
