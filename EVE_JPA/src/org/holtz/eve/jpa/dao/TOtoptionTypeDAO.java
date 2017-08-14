package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TOtoptionType;

public interface TOtoptionTypeDAO {
	public TOtoptionType getOptionTypeById(int id);
	public TOtoptionType getOptionTypeByName(String name);
	public List<TOtoptionType> getOptionTypeList();
	public void save(TOtoptionType optionType);
	public void delete(TOtoptionType optionType);
}
