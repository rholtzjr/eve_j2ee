package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.VrandNumber;

public interface VrandNumberDAO {
	public VrandNumber getVrandNumberById(int id);
	public VrandNumber getVrandNumberByName(String name);
	public List<VrandNumber> getVrandNumberList();
	public void save(VrandNumber vrandNumber);
	public void delete(VrandNumber vrandNumber);
}
