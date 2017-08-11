package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDmdataTypeMenu;

public interface TDmdataTypeMenuDAO {
	public TDmdataTypeMenu getDataTypeMenuById(int id);
	public TDmdataTypeMenu getDataTypeMenuByName(String name);
	public List<TDmdataTypeMenu> getDataTypeMenuList();
	public void save(TDmdataTypeMenu dataTypeMenu);
	public void delete(TDmdataTypeMenu dataTypeMenu);
}
