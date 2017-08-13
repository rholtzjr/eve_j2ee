package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TMtmoduleType;

public interface TMtmoduleTypeDAO {
	public TMtmoduleType getModuleTypeById(int id);
	public TMtmoduleType getModuleTypeByName(String name);
	public List<TMtmoduleType> getModuleTypeList();
	public void save(TMtmoduleType moduleType);
	public void delete(TMtmoduleType moduleType);
}
