package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTpTrip;

public interface TTpTripDAO {
	public TTpTrip getTripById(int id);
	public TTpTrip getTripByName(String name);
	public List<TTpTrip> getTripList();
	public void save(TTpTrip trip);
	public void delete(TTpTrip trip);
}
