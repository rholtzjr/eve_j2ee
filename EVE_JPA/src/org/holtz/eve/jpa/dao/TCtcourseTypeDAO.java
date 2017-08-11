package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCtcourseType;

public interface TCtcourseTypeDAO {
	public TCtcourseType getCourseTypeById(int id);
	public TCtcourseType getCourseTypeByName(String name);
	public List<TCtcourseType> getCourseTypeList();
	public void save(TCtcourseType courseType);
	public void delete(TCtcourseType courseType);
}
