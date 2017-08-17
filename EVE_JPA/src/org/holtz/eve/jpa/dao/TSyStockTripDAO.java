package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSyStockTrip;

public interface TSyStockTripDAO {
	public TSyStockTrip getStockTripById(int id);
	public TSyStockTrip getStockTripByName(String name);
	public List<TSyStockTrip> getStockTripList();
	public void save(TSyStockTrip stockTrip);
	public void delete(TSyStockTrip stockTrip);
}
