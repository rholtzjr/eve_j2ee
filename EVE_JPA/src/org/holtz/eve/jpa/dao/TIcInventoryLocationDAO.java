package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIcInventoryLocation;

public interface TIcInventoryLocationDAO {
	public TIcInventoryLocation getInventoryLocationById(int id);
	public TIcInventoryLocation getInventoryLocationByName(String name);
	public List<TIcInventoryLocation> getInventoryLocationList();
	public void save(TIcInventoryLocation inventoryLocation);
	public void delete(TIcInventoryLocation inventoryLocation);
}
