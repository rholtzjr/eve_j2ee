package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDbdiscountBand;

public interface TDbdiscountBandDAO {
	public TDbdiscountBand getDiscountBandById(int id);
	public TDbdiscountBand getDiscountBandByName(String name);
	public List<TDbdiscountBand> getDiscountBandList();
	public void save(TDbdiscountBand discountBand);
	public void delete(TDbdiscountBand discountBand);
}
