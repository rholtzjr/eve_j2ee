package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEkEmpClockIn;

public interface TEkEmpClockInDAO {
	public TEkEmpClockIn getEmpClockInById(int id);
	public TEkEmpClockIn getEmpClockInByName(String name);
	public List<TEkEmpClockIn> getEmpClockInList();
	public void save(TEkEmpClockIn empClockIn);
	public void delete(TEkEmpClockIn empClockIn);
}
