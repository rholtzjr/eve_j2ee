package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TMdEveModule;

public interface TMdEveModuleDAO {
	public TMdEveModule getEveModuleById(int id);
	public TMdEveModule getEveModuleByName(String name);
	public List<TMdEveModule> getEveModuleList();
	public void save(TMdEveModule eveModule);
	public void delete(TMdEveModule eveModule);
}
