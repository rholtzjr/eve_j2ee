package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCyCountry;

public interface TCyCountryDAO {
	public TCyCountry getCountryById(int id);
	public TCyCountry getCountryByName(String name);
	public List<TCyCountry> getCountryList();
	public void save(TCyCountry country);
	public void delete(TCyCountry country);
}
