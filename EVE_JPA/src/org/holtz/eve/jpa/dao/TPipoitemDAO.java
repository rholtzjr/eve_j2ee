package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPipoitem;

public interface TPipoitemDAO {
	public TPipoitem getPoitemById(int id);
	public TPipoitem getPoitemByName(String name);
	public List<TPipoitem> getPoitemList();
	public void save(TPipoitem poitem);
	public void delete(TPipoitem poitem);
}
