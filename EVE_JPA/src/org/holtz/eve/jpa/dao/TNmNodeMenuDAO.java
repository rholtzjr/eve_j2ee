package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TNmNodeMenu;

public interface TNmNodeMenuDAO {
	public TNmNodeMenu getNodeMenuById(int id);
	public TNmNodeMenu getNodeMenuByName(String name);
	public List<TNmNodeMenu> getNodeMenuList();
	public void save(TNmNodeMenu nodeMenu);
	public void delete(TNmNodeMenu nodeMenu);
}
