package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDiDiveProfile;

public interface TDiDiveProfileDAO {
	public TDiDiveProfile getDiveProfileById(int id);
	public TDiDiveProfile getDiveProfileByName(String name);
	public List<TDiDiveProfile> getDiveProfileList();
	public void save(TDiDiveProfile diveProfile);
	public void delete(TDiDiveProfile diveProfile);
}
