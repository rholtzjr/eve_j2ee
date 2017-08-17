package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TXyexportError;

public interface TXyexportErrorDAO {

	public TXyexportError getExportErrorById(int id);
	public TXyexportError getExportErrorByName(String name);
	public List<TXyexportError> getExportErrorList();
	public void save(TXyexportError exportError);
	public void delete(TXyexportError exportError);
}
