package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEsempSchedule;

public interface TEsempScheduleDAO {
	public TEsempSchedule getEmpScheduleById(int id);
	public TEsempSchedule getEmpScheduleByName(String name);
	public List<TEsempSchedule> getEmpScheduleList();
	public void save(TEsempSchedule empSchedule);
	public void delete(TEsempSchedule empSchedule);
}
