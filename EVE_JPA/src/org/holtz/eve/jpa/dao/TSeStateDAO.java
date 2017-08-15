package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSeState;

public interface TSeStateDAO {

	public TSeState getStateById(int id);
	public TSeState getStateByName(String name);
	public List<TSeState> getStateList();
	public void save(TSeState state);
	public void delete(TSeState state);
}
