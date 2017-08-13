package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TLvSeason;

public interface TLvSeasonDAO {
	public TLvSeason getSeasonById(int id);
	public TLvSeason getSeasonByName(String name);
	public List<TLvSeason> getSeasonList();
	public void save(TLvSeason season);
	public void delete(TLvSeason season);
}
