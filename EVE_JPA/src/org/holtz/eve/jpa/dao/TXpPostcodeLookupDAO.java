package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TXpPostcodeLookup;

public interface TXpPostcodeLookupDAO {

	public TXpPostcodeLookup getPostcodeLookupById(int id);
	public TXpPostcodeLookup getPostcodeLookupByName(String name);
	public List<TXpPostcodeLookup> getPostcodeLookupList();
	public void save(TXpPostcodeLookup postcodeLookup);
	public void delete(TXpPostcodeLookup postcodeLookup);
}
