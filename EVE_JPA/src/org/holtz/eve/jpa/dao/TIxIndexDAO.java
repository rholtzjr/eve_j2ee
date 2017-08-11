package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIxIndex;

public interface TIxIndexDAO {
	public TIxIndex getIndexById(int id);
	public TIxIndex getIndexByName(String name);
	public List<TIxIndex> getIndexList();
	public void save(TIxIndex index);
	public void delete(TIxIndex index);
}
