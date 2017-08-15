package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSpservicePart;

public interface TSpservicePartDAO {
	public TSpservicePart getServicePartById(int id);
	public TSpservicePart getServicePartByName(String name);
	public List<TSpservicePart> getServicePartList();
	public void save(TSpservicePart servicePart);
	public void delete(TSpservicePart servicePart);
}
