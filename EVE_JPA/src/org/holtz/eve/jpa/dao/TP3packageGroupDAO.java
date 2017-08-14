package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TP3packageGroup;

public interface TP3packageGroupDAO {
	public TP3packageGroup getPackageGroupById(int id);
	public TP3packageGroup getPackageGroupByName(String name);
	public List<TP3packageGroup> getPackageGroupList();
	public void save(TP3packageGroup packageGroup);
	public void delete(TP3packageGroup packageGroup);
}
