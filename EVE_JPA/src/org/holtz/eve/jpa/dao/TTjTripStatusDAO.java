package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTjTripStatus;

public interface TTjTripStatusDAO {
	public TTjTripStatus getTripStatusById(int id);
	public TTjTripStatus getTripStatusByName(String name);
	public List<TTjTripStatus> getTripStatusList();
	public void save(TTjTripStatus tripStatus);
	public void delete(TTjTripStatus tripStatus);
}
