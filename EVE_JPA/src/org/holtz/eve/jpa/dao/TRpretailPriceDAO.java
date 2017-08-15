package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRpretailPrice;

public interface TRpretailPriceDAO {
	public TRpretailPrice getRetailPriceById(int id);
	public TRpretailPrice getRetailPriceByName(String name);
	public List<TRpretailPrice> getRetailPriceList();
	public void save(TRpretailPrice retailPrice);
	public void delete(TRpretailPrice retailPrice);
}
