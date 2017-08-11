package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDtdataType;

public interface TDtdataTypeDAO {
	public TDtdataType getDataTypeById(int id);
	public TDtdataType getDataTypeByName(String name);
	public List<TDtdataType> getDataTypeList();
	public void save(TDtdataType dataType);
	public void delete(TDtdataType dataType);
}
