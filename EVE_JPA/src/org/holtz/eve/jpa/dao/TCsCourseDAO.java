package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCsCourse;

public interface TCsCourseDAO {
	public TCsCourse getCourseById(int id);
	public TCsCourse getCourseByName(String name);
	public List<TCsCourse> getCourseList();
	public void save(TCsCourse course);
	public void delete(TCsCourse course);
}
