package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSgServiceBookingItem;

public interface TSgServiceBookingItemDAO {

	public TSgServiceBookingItem getServiceBookingItemById(int id);
	public TSgServiceBookingItem getServiceBookingItemByName(String name);
	public List<TSgServiceBookingItem> getServiceBookingItemList();
	public void save(TSgServiceBookingItem serviceBookingItem);
	public void delete(TSgServiceBookingItem serviceBookingItem);
}
