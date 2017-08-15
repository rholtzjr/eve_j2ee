package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TS7specialInterest;

public interface TS7specialInterestDAO {
	public TS7specialInterest getSpecialInterestById(int id);
	public TS7specialInterest getSpecialInterestByName(String name);
	public List<TS7specialInterest> getSpecialInterestList();
	public void save(TS7specialInterest specialInterest);
	public void delete(TS7specialInterest specialInterest);
}
