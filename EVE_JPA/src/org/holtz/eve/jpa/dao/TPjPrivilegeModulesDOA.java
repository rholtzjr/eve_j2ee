package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPjPrivilegeModules;

public interface TPjPrivilegeModulesDOA {
	public TPjPrivilegeModules getPrivilegeModulesById(int id);
	public TPjPrivilegeModules getPrivilegeModulesByName(String name);
	public List<TPjPrivilegeModules> getPrivilegeModulesList();
	public void save(TPjPrivilegeModules privilegeModules);
	public void delete(TPjPrivilegeModules privilegeModules);
}
