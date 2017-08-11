package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCkCustTripChecklist;

public interface TCkCustTripChecklistDAO {
	public TCkCustTripChecklist getChecklistById(int id);
	public TCkCustTripChecklist getChecklistByName(String name);
	public List<TCkCustTripChecklist> getChecklistList();
	public void save(TCkCustTripChecklist checklist);
	public void delete(TCkCustTripChecklist checklist);
}
