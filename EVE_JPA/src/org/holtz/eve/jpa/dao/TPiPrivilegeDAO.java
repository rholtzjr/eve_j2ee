package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPiPrivilege;

public interface TPiPrivilegeDAO {
	public TPiPrivilege getPrivilegeById(int id);
	public TPiPrivilege getPrivilegeByName(String name);
	public List<TPiPrivilege> getPrivilegeList();
	public void save(TPiPrivilege privilege);
	public void delete(TPiPrivilege privilege);
}
