package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TZoStoreDataType;

public interface TZoStoreDataTypeDAO {
	public TZoStoreDataType getStoreDataTypeById(int id);
	public TZoStoreDataType getStoreDataTypeByName(String name);
	public List<TZoStoreDataType> getStoreDataTypeList();
	public void save(TZoStoreDataType storeDataType);
	public void delete(TZoStoreDataType storeDataType);
}
