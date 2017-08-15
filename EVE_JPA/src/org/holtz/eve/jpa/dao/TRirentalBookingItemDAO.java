package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRirentalBookingItem;

public interface TRirentalBookingItemDAO {
	public TRirentalBookingItem getRentalBookingItemById(int id);
	public TRirentalBookingItem getRentalBookingItemByName(String name);
	public List<TRirentalBookingItem> getRentalBookingItemList();
	public void save(TRirentalBookingItem rentalBookingItem);
	public void delete(TRirentalBookingItem rentalBookingItem);
}
