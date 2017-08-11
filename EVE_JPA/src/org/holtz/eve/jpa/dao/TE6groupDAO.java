package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TE6group;

public interface TE6groupDAO {
	public TE6group getGroupById(int id);
	public TE6group getGroupByName(String name);
	public List<TE6group> getGroupList();
	public void save(TE6group group);
	public void delete(TE6group group);
}
