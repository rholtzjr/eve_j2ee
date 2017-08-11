package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TImImport;

public interface TImImportDAO {
	public TImImport getImportById(int id);
	public TImImport getImportByName(String name);
	public List<TImImport> getImportList();
	public void save(TImImport timimport);
	public void delete(TImImport timimport);
}
