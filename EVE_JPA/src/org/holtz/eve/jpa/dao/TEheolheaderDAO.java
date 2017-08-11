package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEheolheader;

public interface TEheolheaderDAO {
	public TEheolheader getEolHeaderById(int id);
	public TEheolheader getEolHeaderByName(String name);
	public List<TEheolheader> getEolHeaderList();
	public void save(TEheolheader eolHeader);
	public void delete(TEheolheader eolHeader);
}
