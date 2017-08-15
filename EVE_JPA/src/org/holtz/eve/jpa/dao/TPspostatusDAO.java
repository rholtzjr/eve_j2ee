package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPspostatus;

public interface TPspostatusDAO {
	public TPspostatus getPostatusById(int id);
	public TPspostatus getPostatusByName(String name);
	public List<TPspostatus> getPostatusList();
	public void save(TPspostatus postatus);
	public void delete(TPspostatus postatus);
}
