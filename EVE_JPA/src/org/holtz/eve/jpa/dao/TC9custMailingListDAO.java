package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TC9custMailingList;

public interface TC9custMailingListDAO {
	public TC9custMailingList getCustMailingListById(int id);
	public TC9custMailingList getCustMailingListByName(String name);
	public List<TC9custMailingList> getCustMailingList();
	public void save(TC9custMailingList account);
	public void delete(TC9custMailingList account);
}
