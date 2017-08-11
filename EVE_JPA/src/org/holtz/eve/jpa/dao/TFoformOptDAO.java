package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TFoformOpt;

public interface TFoformOptDAO {
	public TFoformOpt getFormOptById(int id);
	public TFoformOpt getFormOptByName(String name);
	public List<TFoformOpt> getFormOptList();
	public void save(TFoformOpt formOpt);
	public void delete(TFoformOpt formOpt);
}
