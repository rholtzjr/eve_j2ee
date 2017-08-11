package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDaData;

public interface TDaDataDOA {
	public TDaData getDataById(int id);
	public TDaData getDataByName(String name);
	public List<TDaData> getDataList();
	public void save(TDaData data);
	public void delete(TDaData data);
}
