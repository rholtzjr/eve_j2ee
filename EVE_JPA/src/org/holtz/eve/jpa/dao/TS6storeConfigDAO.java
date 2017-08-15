package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TS6storeConfig;

public interface TS6storeConfigDAO {
	public TS6storeConfig getStoreConfigById(int id);
	public TS6storeConfig getStoreConfigByName(String name);
	public List<TS6storeConfig> getStoreConfigList();
	public void save(TS6storeConfig storeConfig);
	public void delete(TS6storeConfig storeConfig);
}
