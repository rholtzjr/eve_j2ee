package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TMnMenu;

public interface TMnMenuDAO {
	public TMnMenu getMenuById(int id);
	public TMnMenu getMenuByName(String name);
	public List<TMnMenu> getMenuList();
	public void save(TMnMenu menu);
	public void delete(TMnMenu menu);
}
