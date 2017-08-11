package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TLhLookupCache;

public interface TLhLookupCacheDAO {
	public TLhLookupCache getLookupCacheById(int id);
	public TLhLookupCache getLookupCacheByName(String name);
	public List<TLhLookupCache> getLookupCacheList();
	public void save(TLhLookupCache lookupCache);
	public void delete(TLhLookupCache lookupCache);
}
