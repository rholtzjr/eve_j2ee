package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TMoModule;

public interface TMoModuleDAO {
	public TMoModule getModuleById(int id);
	public TMoModule getModuleByName(String name);
	public List<TMoModule> getModuleList();
	public void save(TMoModule module);
	public void delete(TMoModule module);
}
