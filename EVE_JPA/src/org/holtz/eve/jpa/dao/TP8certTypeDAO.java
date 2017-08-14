package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TP8certType;

public interface TP8certTypeDAO {
	public TP8certType getCertTypeById(int id);
	public TP8certType getCertTypeByName(String name);
	public List<TP8certType> getCertTypeList();
	public void save(TP8certType certType);
	public void delete(TP8certType certType);
}
