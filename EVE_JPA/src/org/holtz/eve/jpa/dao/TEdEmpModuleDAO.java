package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEdEmpModule;

public interface TEdEmpModuleDAO {
	public TEdEmpModule getEmpModuleById(int id);
	public TEdEmpModule getEmpModuleByName(String name);
	public List<TEdEmpModule> getEmpModuleList();
	public void save(TEdEmpModule empModule);
	public void delete(TEdEmpModule empModule);
}
