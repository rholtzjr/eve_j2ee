package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCpCustTrip;

public interface TCpCustTripDAO {
	public TCpCustTrip getCustTripById(int id);
	public TCpCustTrip getCustTripByName(String name);
	public List<TCpCustTrip> getCustTripList();
	public void save(TCpCustTrip custTrip);
	public void delete(TCpCustTrip custTrip);
}
