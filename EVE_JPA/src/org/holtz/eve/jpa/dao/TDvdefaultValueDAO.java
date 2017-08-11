package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDvdefaultValue;

public interface TDvdefaultValueDAO {
	public TDvdefaultValue getDefaultValueById(int id);
	public TDvdefaultValue getDefaultValueByName(String name);
	public List<TDvdefaultValue> getDefaultValueList();
	public void save(TDvdefaultValue defaultValue);
	public void delete(TDvdefaultValue defaultValue);
}
