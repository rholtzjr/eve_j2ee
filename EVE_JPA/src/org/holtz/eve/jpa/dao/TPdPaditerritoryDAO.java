package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPdPaditerritory;

public interface TPdPaditerritoryDAO {
	public TPdPaditerritory getPaditerritoryById(int id);
	public TPdPaditerritory getPaditerritoryByName(String name);
	public List<TPdPaditerritory> getPaditerritoryList();
	public void save(TPdPaditerritory paditerritory);
	public void delete(TPdPaditerritory paditerritory);
}
