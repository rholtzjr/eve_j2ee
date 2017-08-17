package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TVcvalidCountry;

public interface TVcvalidCountryDAO {
	public TVcvalidCountry getValidCountryById(int id);
	public TVcvalidCountry getValidCountryByName(String name);
	public List<TVcvalidCountry> getValidCountryList();
	public void save(TVcvalidCountry validCountry);
	public void delete(TVcvalidCountry validCountry);
}
