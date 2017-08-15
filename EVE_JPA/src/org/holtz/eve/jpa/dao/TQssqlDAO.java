package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TQssql;

public interface TQssqlDAO {
	public TQssql getSqlById(int id);
	public TQssql getSqlByName(String name);
	public List<TQssql> getSqlList();
	public void save(TQssql sql);
	public void delete(TQssql sql);
}
