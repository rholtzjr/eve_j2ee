package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TReRoomType;

public interface TReRoomTypeDAO {
	public TReRoomType getRoomTypeById(int id);
	public TReRoomType getRoomTypeByName(String name);
	public List<TReRoomType> getRoomTypeList();
	public void save(TReRoomType roomType);
	public void delete(TReRoomType roomType);
}
