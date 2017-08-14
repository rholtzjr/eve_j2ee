package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TP5pictype;

public interface TP5pictypeDAO {
	public TP5pictype getPictypeById(int id);
	public TP5pictype getPictypeByName(String name);
	public List<TP5pictype> getPictypeList();
	public void save(TP5pictype pictype);
	public void delete(TP5pictype pictype);
}
