package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTttaskType;

public interface TTttaskTypeDAO {
	public TTttaskType getTaskTypeById(int id);
	public TTttaskType getTaskTypeByName(String name);
	public List<TTttaskType> getTaskTypeList();
	public void save(TTttaskType taskType);
	public void delete(TTttaskType taskType);
}
