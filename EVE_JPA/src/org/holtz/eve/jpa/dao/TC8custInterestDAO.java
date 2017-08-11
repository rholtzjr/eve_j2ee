package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TC8custInterest;

public interface TC8custInterestDAO {

	public TC8custInterest getCustInterestById(int id);
	public TC8custInterest getCustInterestByName(String name);
	public List<TC8custInterest> getCustInterestList();
	public void save(TC8custInterest account);
	public void delete(TC8custInterest account);
}
