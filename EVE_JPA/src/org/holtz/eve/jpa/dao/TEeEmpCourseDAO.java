package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEeEmpCourse;

public interface TEeEmpCourseDAO {
	public TEeEmpCourse getEmpCourseById(int id);
	public TEeEmpCourse getEmpCourseByName(String name);
	public List<TEeEmpCourse> getEmpCourseList();
	public void save(TEeEmpCourse empCourse);
	public void delete(TEeEmpCourse empCourse);
}
