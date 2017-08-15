package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSjShippingPrice;

public interface TSjShippingPriceDAO {
	public TSjShippingPrice getShippingPriceById(int id);
	public TSjShippingPrice getShippingPriceByName(String name);
	public List<TSjShippingPrice> getShippingPriceList();
	public void save(TSjShippingPrice shippingPrice);
	public void delete(TSjShippingPrice shippingPrice);
}
