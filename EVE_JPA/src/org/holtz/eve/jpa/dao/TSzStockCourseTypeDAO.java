package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSzStockCourseType;

public interface TSzStockCourseTypeDAO {
	public TSzStockCourseType getStockCourseTypeById(int id);
	public TSzStockCourseType getStockCourseTypeByName(String name);
	public List<TSzStockCourseType> getStockCourseTypeList();
	public void save(TSzStockCourseType stockCourseType);
	public void delete(TSzStockCourseType stockCourseType);
}
