package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TP2pcreportType;

public interface TP2pcreportTypeDAO {
	public TP2pcreportType getPcreportTypeById(int id);
	public TP2pcreportType getPcreportTypeByName(String name);
	public List<TP2pcreportType> getPcreportTypeList();
	public void save(TP2pcreportType pcreportType);
	public void delete(TP2pcreportType pcreportType);
}
