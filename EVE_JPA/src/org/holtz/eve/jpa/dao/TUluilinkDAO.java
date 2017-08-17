package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TUluilink;

public interface TUluilinkDAO {
	public TUluilink getUilinkById(int id);
	public TUluilink getUilinkByName(String name);
	public List<TUluilink> getUilinkList();
	public void save(TUluilink uilink);
	public void delete(TUluilink uilink);
}
