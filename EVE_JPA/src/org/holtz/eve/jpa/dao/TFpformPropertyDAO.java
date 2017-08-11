package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TFpformProperty;

public interface TFpformPropertyDAO {
	public TFpformProperty getFormPropertyById(int id);
	public TFpformProperty getFormPropertyByName(String name);
	public List<TFpformProperty> getFormPropertyList();
	public void save(TFpformProperty formProperty);
	public void delete(TFpformProperty formProperty);
}
