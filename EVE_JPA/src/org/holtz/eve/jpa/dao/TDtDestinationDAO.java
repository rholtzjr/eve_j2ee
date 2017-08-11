package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDtDestination;

public interface TDtDestinationDAO {
	public TDtDestination getDestinationById(int id);
	public TDtDestination getDestinationByName(String name);
	public List<TDtDestination> getDestinationList();
	public void save(TDtDestination destination);
	public void delete(TDtDestination destination);
}
