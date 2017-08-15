package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSbserviceBooking;

public interface TSbserviceBookingDAO {
	public TSbserviceBooking getServiceBookingById(int id);
	public TSbserviceBooking getServiceBookingByName(String name);
	public List<TSbserviceBooking> getServiceBookingList();
	public void save(TSbserviceBooking serviceBooking);
	public void delete(TSbserviceBooking serviceBooking);
}
