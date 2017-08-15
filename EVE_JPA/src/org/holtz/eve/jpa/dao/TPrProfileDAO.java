package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPrProfile;

public interface TPrProfileDAO {
	public TPrProfile getProfileById(int id);
	public TPrProfile getProfileByName(String name);
	public List<TPrProfile> getProfileList();
	public void save(TPrProfile profile);
	public void delete(TPrProfile profile);
}
