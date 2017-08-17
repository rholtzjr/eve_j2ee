package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTbtaxBand;

public interface TTbtaxBandDAO {
	public TTbtaxBand getTaxBandById(int id);
	public TTbtaxBand getTaxBandByName(String name);
	public List<TTbtaxBand> getTaxBandList();
	public void save(TTbtaxBand taxBand);
	public void delete(TTbtaxBand taxBand);
}
