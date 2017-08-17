package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TXcshippingCountry;

public interface TXcshippingCountryDAO {

	public TXcshippingCountry getShippingCountryById(int id);
	public TXcshippingCountry getShippingCountryByName(String name);
	public List<TXcshippingCountry> getShippingCountryList();
	public void save(TXcshippingCountry shippingCountry);
	public void delete(TXcshippingCountry shippingCountry);
}
