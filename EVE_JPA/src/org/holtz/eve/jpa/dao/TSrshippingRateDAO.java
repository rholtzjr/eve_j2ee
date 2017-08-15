package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSrshippingRate;

public interface TSrshippingRateDAO {
	public TSrshippingRate getShippingRateById(int id);
	public TSrshippingRate getShippingRateByName(String name);
	public List<TSrshippingRate> getShippingRateList();
	public void save(TSrshippingRate shippingRate);
	public void delete(TSrshippingRate shippingRate);
}
