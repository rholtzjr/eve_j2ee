package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.THtHotel;

public interface THtHotelDAO {
	public THtHotel getHotelById(int id);
	public THtHotel getHotelByName(String name);
	public List<THtHotel> getHotelList();
	public void save(THtHotel hotel);
	public void delete(THtHotel hotel);
}
