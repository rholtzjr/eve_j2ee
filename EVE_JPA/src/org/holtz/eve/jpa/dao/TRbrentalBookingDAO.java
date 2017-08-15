package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRbrentalBooking;

public interface TRbrentalBookingDAO {
	public TRbrentalBooking getRentalBookingById(int id);
	public TRbrentalBooking getRentalBookingByName(String name);
	public List<TRbrentalBooking> getRentalBookingList();
	public void save(TRbrentalBooking rentalBooking);
	public void delete(TRbrentalBooking rentalBooking);
}
