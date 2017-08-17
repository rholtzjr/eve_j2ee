package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTeTerm;

public interface TTeTermDAO {
	public TTeTerm getTermById(int id);
	public TTeTerm getTermByName(String name);
	public List<TTeTerm> getTermList();
	public void save(TTeTerm term);
	public void delete(TTeTerm term);
}
