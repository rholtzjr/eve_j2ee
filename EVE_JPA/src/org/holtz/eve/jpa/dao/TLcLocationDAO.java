package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TLcLocation;

public interface TLcLocationDAO {
	public TLcLocation getLocationById(int id);
	public TLcLocation getLocationByName(String name);
	public List<TLcLocation> getLocationList();
	public void save(TLcLocation location);
	public void delete(TLcLocation location);
}
