package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TVsvalidState;

public interface TVsvalidStateDAO {
	public TVsvalidState getValidStateById(int id);
	public TVsvalidState getValidStateByName(String name);
	public List<TVsvalidState> getValidStateList();
	public void save(TVsvalidState validState);
	public void delete(TVsvalidState validState);
}
