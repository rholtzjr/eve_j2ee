package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TS1salesSearch;

public interface TS1salesSearchDAO {
	public TS1salesSearch getSalesSearchById(int id);
	public TS1salesSearch getSalesSearchByName(String name);
	public List<TS1salesSearch> getSalesSearchList();
	public void save(TS1salesSearch salesSearch);
	public void delete(TS1salesSearch salesSearch);
}
