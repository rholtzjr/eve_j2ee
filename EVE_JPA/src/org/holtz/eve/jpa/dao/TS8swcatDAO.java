package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TS8swcat;

public interface TS8swcatDAO {
	public TS8swcat getSwcatById(int id);
	public TS8swcat getSwcatByName(String name);
	public List<TS8swcat> getSwcatList();
	public void save(TS8swcat swcat);
	public void delete(TS8swcat swcat);
}
