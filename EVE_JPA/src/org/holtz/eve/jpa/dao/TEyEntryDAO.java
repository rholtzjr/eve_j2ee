package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEyEntry;

public interface TEyEntryDAO {
	public TEyEntry getTEyEntryById(int id);
	public TEyEntry getTEyEntryByName(String name);
	public List<TEyEntry> getTEyEntryList();
	public void save(TEyEntry teyEntry);
	public void delete(TEyEntry teyEntry);
}
