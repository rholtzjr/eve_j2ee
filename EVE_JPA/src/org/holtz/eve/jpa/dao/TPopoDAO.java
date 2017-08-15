package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPopo;

public interface TPopoDAO {
	public TPopo getPoById(int id);
	public TPopo getPoByName(String name);
	public List<TPopo> getPoList();
	public void save(TPopo po);
	public void delete(TPopo po);
}
