package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCgcustGroup;

public interface TCgcustGroupDAO {
	public TCgcustGroup getCustGroupById(int id);
	public TCgcustGroup getCustGroupByName(String name);
	public List<TCgcustGroup> getCustGroupList();
	public void save(TCgcustGroup custGroup);
	public void delete(TCgcustGroup custGroup);
}
