package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCiCustCourseChecklist;

public interface TCiCustCourseChecklistDAO {
	public TCiCustCourseChecklist getCourseCheckListById(int id);
	public TCiCustCourseChecklist getCourseCheckListByName(String name);
	public List<TCiCustCourseChecklist> getCourseCheckListList();
	public void save(TCiCustCourseChecklist checkList);
	public void delete(TCiCustCourseChecklist checkList);
}
