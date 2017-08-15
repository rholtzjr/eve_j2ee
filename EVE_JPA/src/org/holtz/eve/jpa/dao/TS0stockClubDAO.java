package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TS0stockClub;

public interface TS0stockClubDAO {
	public TS0stockClub getStockClubById(int id);
	public TS0stockClub getStockClubByName(String name);
	public List<TS0stockClub> getStockClubList();
	public void save(TS0stockClub stockClub);
	public void delete(TS0stockClub stockClub);
}
