package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSxSex;

public interface TSxSexDAO {
	public TSxSex getSexById(int id);
	public TSxSex getSexByName(String name);
	public List<TSxSex> getSexList();
	public void save(TSxSex sex);
	public void delete(TSxSex sex);
}
