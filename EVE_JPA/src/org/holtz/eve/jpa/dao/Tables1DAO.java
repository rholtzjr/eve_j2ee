package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.Tables1;

public interface Tables1DAO {
	public Tables1 getTables1ById(int id);
	public Tables1 getTables1ByName(String name);
	public List<Tables1> getTables1List();
	public void save(Tables1 tables1);
	public void delete(Tables1 tables1);
}
