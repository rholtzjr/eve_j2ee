package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSwswtax2;

public interface TSwswtax2DAO {
	public TSwswtax2 getSwtax2ById(int id);
	public TSwswtax2 getSwtax2ByName(String name);
	public List<TSwswtax2> getSwtax2List();
	public void save(TSwswtax2 swtax2);
	public void delete(TSwswtax2 swtax2);
}
