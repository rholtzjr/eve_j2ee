package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TScSource;

public interface TScSourceDAO {

	public TScSource getSourceById(int id);
	public TScSource getSourceByName(String name);
	public List<TScSource> getSourceList();
	public void save(TScSource source);
	public void delete(TScSource source);
}
