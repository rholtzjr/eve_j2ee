package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TXswo;

public interface TXswoDAO {

	public TXswo getWoById(int id);
	public TXswo getWoByName(String name);
	public List<TXswo> getWoList();
	public void save(TXswo wo);
	public void delete(TXswo wo);
}
