package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TY1synonym;

public interface TY1synonymDAO {
	public TY1synonym getSynonymById(int id);
	public TY1synonym getSynonymByName(String name);
	public List<TY1synonym> getSynonymList();
	public void save(TY1synonym synonym);
	public void delete(TY1synonym synonym);
}
