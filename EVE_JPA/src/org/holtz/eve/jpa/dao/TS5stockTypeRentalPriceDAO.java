package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TS5stockTypeRentalPrice;

public interface TS5stockTypeRentalPriceDAO {

	public TS5stockTypeRentalPrice getStockTypeRentalPriceById(int id);
	public TS5stockTypeRentalPrice getStockTypeRentalPriceByName(String name);
	public List<TS5stockTypeRentalPrice> getStockTypeRentalPriceList();
	public void save(TS5stockTypeRentalPrice stockTypeRentalPrice);
	public void delete(TS5stockTypeRentalPrice stockTypeRentalPrice);
}
