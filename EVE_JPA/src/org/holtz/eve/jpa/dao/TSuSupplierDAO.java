package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSuSupplier;

public interface TSuSupplierDAO {
	public TSuSupplier getSupplierById(int id);
	public TSuSupplier getSupplierByName(String name);
	public List<TSuSupplier> getSupplierList();
	public void save(TSuSupplier supplier);
	public void delete(TSuSupplier supplier);
}
