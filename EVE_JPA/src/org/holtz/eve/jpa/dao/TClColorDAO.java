package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TClColor;

public interface TClColorDAO {
	public TClColor getColorById(int id);
	public TClColor getColorByName(String name);
	public List<TClColor> getColorList();
	public void save(TClColor color);
	public void delete(TClColor color);
}
