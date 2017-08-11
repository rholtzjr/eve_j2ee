package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TGrgiftRegistry;

public interface TGrgiftRegistryDAO {
	public TGrgiftRegistry getGiftRegistryById(int id);
	public TGrgiftRegistry getGiftRegistryByName(String name);
	public List<TGrgiftRegistry> getGiftRegistryList();
	public void save(TGrgiftRegistry giftRegistry);
	public void delete(TGrgiftRegistry giftRegistry);
}
