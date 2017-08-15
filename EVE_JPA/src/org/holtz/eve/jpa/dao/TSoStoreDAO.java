package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSoStore;

public interface TSoStoreDAO {
	public TSoStore getStoreById(int id);
	public TSoStore getStoreByName(String name);
	public List<TSoStore> getStoreList();
	public void save(TSoStore store);
	public void delete(TSoStore store);
}
