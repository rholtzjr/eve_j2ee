package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCacertAgency;

public interface TCacertAgencyDAO {

	public TCacertAgency getCertAgencyById(int id);
	public TCacertAgency getCertAgencyByName(String name);
	public List<TCacertAgency> getCertAgencyList();
	public void save(TCacertAgency account);
	public void delete(TCacertAgency account);
}
