package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSlstockCourse;

public interface TSlstockCourseDAO {

	public TSlstockCourse getStockCourseById(int id);
	public TSlstockCourse getStockCourseByName(String name);
	public List<TSlstockCourse> getStockCourseList();
	public void save(TSlstockCourse stockCourse);
	public void delete(TSlstockCourse stockCourse);
}
