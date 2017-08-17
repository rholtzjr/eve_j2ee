package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TWcwebCurrency;

public interface TWcwebCurrencyDAO {
	public TWcwebCurrency getWebCurrencyById(int id);
	public TWcwebCurrency getWebCurrencyByName(String name);
	public List<TWcwebCurrency> getWebCurrencyList();
	public void save(TWcwebCurrency webCurrency);
	public void delete(TWcwebCurrency webCurrency);
}
