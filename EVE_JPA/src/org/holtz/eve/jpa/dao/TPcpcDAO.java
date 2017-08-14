package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPcpc;

public interface TPcpcDAO {
	public TPcpc getPcById(int id);
	public TPcpc getPcByName(String name);
	public List<TPcpc> getPcList();
	public void save(TPcpc account);
	public void delete(TPcpc account);
}
