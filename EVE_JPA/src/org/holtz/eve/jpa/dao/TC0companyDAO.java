package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TC0company;

public interface TC0companyDAO {

	public TC0company getCompanyById(int id);
	public TC0company getCompanyByName(String name);
	public List<TC0company> getCompanyList();
	public void save(TC0company company);
	public void delete(TC0company company);
}
