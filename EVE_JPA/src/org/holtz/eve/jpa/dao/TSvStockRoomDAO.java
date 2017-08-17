package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSvStockRoom;

public interface TSvStockRoomDAO {
	public TSvStockRoom getStockRoomById(int id);
	public TSvStockRoom getStockRoomByName(String name);
	public List<TSvStockRoom> getStockRoomList();
	public void save(TSvStockRoom stockRoom);
	public void delete(TSvStockRoom stockRoom);
}
