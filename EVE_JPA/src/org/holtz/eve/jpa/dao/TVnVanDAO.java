package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TVnVan;

public interface TVnVanDAO {

	public TVnVan getVanById(int id);
	public TVnVan getVanByName(String name);
	public List<TVnVan> getVanList();
	public void save(TVnVan van);
	public void delete(TVnVan van);
}
