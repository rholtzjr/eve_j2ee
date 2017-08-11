package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TC1custCourse;

public interface TC1custCourseDAO {

	public TC1custCourse getCustCourseById(int id);
	public TC1custCourse getCustCourseByName(String name);
	public List<TC1custCourse> getCustCourseList();
	public void save(TC1custCourse custCourse);
	public void delete(TC1custCourse custCourse);
}
