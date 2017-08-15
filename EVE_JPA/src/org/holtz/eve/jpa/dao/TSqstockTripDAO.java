package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSqstockTrip;

public interface TSqstockTripDAO {
	public TSqstockTrip getStockTripById(int id);
	public TSqstockTrip getStockTripByName(String name);
	public List<TSqstockTrip> getStockTripList();
	public void save(TSqstockTrip stockTrip);
	public void delete(TSqstockTrip stockTrip);
}
