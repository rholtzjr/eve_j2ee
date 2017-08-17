package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TXxexport;

public interface TXxexportDAO {
	public TXxexport getExportById(int id);
	public TXxexport getExportByName(String name);
	public List<TXxexport> getExportList();
	public void save(TXxexport export);
	public void delete(TXxexport export);
}
