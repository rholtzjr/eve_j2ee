package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEtempTrip;

public interface TEtempTripDAO {
	public TEtempTrip getEmpTripById(int id);
	public TEtempTrip getEmpTripByName(String name);
	public List<TEtempTrip> getEmpTripList();
	public void save(TEtempTrip empTrip);
	public void delete(TEtempTrip empTrip);
}
