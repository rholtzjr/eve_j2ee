package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TC6custPopup;

public interface TC6custPopUpDAO {

	public TC6custPopup getCustPopUpById(int id);
	public TC6custPopup getCustPopUpByName(String name);
	public List<TC6custPopup> getCustPopUpList();
	public void save(TC6custPopup account);
	public void delete(TC6custPopup account);
}
