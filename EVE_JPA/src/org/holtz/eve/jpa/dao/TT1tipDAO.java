package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TT1tip;

public interface TT1tipDAO {
	public TT1tip getTipById(int id);
	public TT1tip getTipByName(String name);
	public List<TT1tip> getTipList();
	public void save(TT1tip tip);
	public void delete(TT1tip tip);
}
