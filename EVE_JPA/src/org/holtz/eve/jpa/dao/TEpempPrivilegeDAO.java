package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEpempPrivilege;

public interface TEpempPrivilegeDAO {
	public TEpempPrivilege getEmpPrivilegeById(int id);
	public TEpempPrivilege getEmpPrivilegeByName(String name);
	public List<TEpempPrivilege> getEmpPrivilegeList();
	public void save(TEpempPrivilege empPrivilege);
	public void delete(TEpempPrivilege empPrivilege);
}
