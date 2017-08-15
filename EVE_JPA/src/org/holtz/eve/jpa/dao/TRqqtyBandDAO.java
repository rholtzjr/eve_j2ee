package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRqqtyBand;

public interface TRqqtyBandDAO {
	public TRqqtyBand getQtyBandById(int id);
	public TRqqtyBand getQtyBandByName(String name);
	public List<TRqqtyBand> getQtyBandList();
	public void save(TRqqtyBand qtyBand);
	public void delete(TRqqtyBand qtyBand);
}
