package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRcrebicategory;

public interface TRcrebicategoryDAO {
	public TRcrebicategory getRebicategoryById(int id);
	public TRcrebicategory getRebicategoryByName(String name);
	public List<TRcrebicategory> getRebicategoryList();
	public void save(TRcrebicategory rebicategory);
	public void delete(TRcrebicategory rebicategory);
}
