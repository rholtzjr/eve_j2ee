package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TErempRole;

public interface TErempRoleDAO {
	public TErempRole getEmpRoleById(int id);
	public TErempRole getEmpRoleByName(String name);
	public List<TErempRole> getEmpRoleList();
	public void save(TErempRole empRole);
	public void delete(TErempRole empRole);
}
