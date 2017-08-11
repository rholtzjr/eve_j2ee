package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIlimportLog;

public interface TIlimportLogDAO {
	public TIlimportLog getImportLogById(int id);
	public TIlimportLog getImportLogByName(String name);
	public List<TIlimportLog> getImportLogList();
	public void save(TIlimportLog importLog);
	public void delete(TIlimportLog importLog);
}
