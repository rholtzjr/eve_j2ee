package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TS9swtax;

public interface TS9swtaxDAO {
	public TS9swtax getSwtaxById(int id);
	public TS9swtax getSwtaxByName(String name);
	public List<TS9swtax> getSwtaxList();
	public void save(TS9swtax swtax);
	public void delete(TS9swtax swtax);
}
