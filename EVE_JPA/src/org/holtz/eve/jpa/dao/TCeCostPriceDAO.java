package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCeCostPrice;

public interface TCeCostPriceDAO {
	public TCeCostPrice getCostPriceById(int id);
	public TCeCostPrice getCostPriceByName(String name);
	public List<TCeCostPrice> getCostPriceList();
	public void save(TCeCostPrice costPrice);
	public void delete(TCeCostPrice costPrice);

}
