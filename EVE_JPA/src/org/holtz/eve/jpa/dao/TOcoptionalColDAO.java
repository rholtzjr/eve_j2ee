package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TOcoptionalCol;

public interface TOcoptionalColDAO {
	public TOcoptionalCol getOptionalColById(int id);
	public TOcoptionalCol getOptionalColByName(String name);
	public List<TOcoptionalCol> getOptionalColList();
	public void save(TOcoptionalCol optionalCol);
	public void delete(TOcoptionalCol optionalCol);
}
