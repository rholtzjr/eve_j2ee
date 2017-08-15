package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRkRoomBooking;

public interface TRkRoomBookingDAO {
	public TRkRoomBooking getRoomBookingById(int id);
	public TRkRoomBooking getRoomBookingByName(String name);
	public List<TRkRoomBooking> getRoomBookingList();
	public void save(TRkRoomBooking roomBooking);
	public void delete(TRkRoomBooking roomBooking);
}
