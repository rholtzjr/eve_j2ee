package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TXzshippingZone;

public interface TXzshippingZoneDAO {
	public TXzshippingZone getShippingZoneById(int id);
	public TXzshippingZone getShippingZoneByName(String name);
	public List<TXzshippingZone> getShippingZoneList();
	public void save(TXzshippingZone shippingZone);
	public void delete(TXzshippingZone shippingZone);
}
