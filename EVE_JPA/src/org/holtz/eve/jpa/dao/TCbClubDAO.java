package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCbClub;

public interface TCbClubDAO {
	public TCbClub getClubById(int id);
	public TCbClub getClubByName(String name);
	public List<TCbClub> getClubList();
	public void save(TCbClub account);
	public void delete(TCbClub account);
}
