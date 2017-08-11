package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TCjCourseStatus;

public interface TCjCourseStatusDAO {
	public TCjCourseStatus getCourseStatusById(int id);
	public TCjCourseStatus getCourseStatusByName(String name);
	public List<TCjCourseStatus> getCourseStatusList();
	public void save(TCjCourseStatus courseStatus);
	public void delete(TCjCourseStatus courseStatus);
}
