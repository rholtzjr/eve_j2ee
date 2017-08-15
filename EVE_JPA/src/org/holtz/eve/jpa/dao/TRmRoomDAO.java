package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRmRoom;

public interface TRmRoomDAO {
	public TRmRoom getRoomById(int id);
	public TRmRoom getRoomByName(String name);
	public List<TRmRoom> getRoomList();
	public void save(TRmRoom room);
	public void delete(TRmRoom room);
}
