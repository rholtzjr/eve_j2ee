package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCfCustClub;

public interface TCfCustClubDAO {
	public TCfCustClub getCustClubById(int id);
	public TCfCustClub getCustClubByName(String name);
	public List<TCfCustClub> getCustClubList();
	public void save(TCfCustClub account);
	public void delete(TCfCustClub account);

}
