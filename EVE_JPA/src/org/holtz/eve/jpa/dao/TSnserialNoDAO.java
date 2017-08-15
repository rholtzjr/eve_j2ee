package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSnserialNo;

public interface TSnserialNoDAO {
	public TSnserialNo getSerialNoById(int id);
	public TSnserialNo getSerialNoByName(String name);
	public List<TSnserialNo> getSerialNoList();
	public void save(TSnserialNo serialNo);
	public void delete(TSnserialNo serialNo);
}
