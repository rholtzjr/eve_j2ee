package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCccostCenter;

public interface TCccostCenterDAO {
	public TCccostCenter getCostCenterById(int id);
	public TCccostCenter getCostCenterByName(String name);
	public List<TCccostCenter> getCostCenterList();
	public void save(TCccostCenter costCenter);
	public void delete(TCccostCenter costCenter);
}
