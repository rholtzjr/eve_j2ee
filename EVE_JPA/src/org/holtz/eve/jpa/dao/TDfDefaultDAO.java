package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDfDefault;

public interface TDfDefaultDAO {
	public TDfDefault getDefaultById(int id);
	public TDfDefault getDefaultByName(String name);
	public List<TDfDefault> getDefaultList();
	public void save(TDfDefault dft);
	public void delete(TDfDefault dft);
}
