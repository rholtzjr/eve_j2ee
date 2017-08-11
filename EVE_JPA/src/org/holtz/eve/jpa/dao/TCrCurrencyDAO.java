package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCrCurrency;

public interface TCrCurrencyDAO {
	public TCrCurrency getCurrencyById(int id);
	public TCrCurrency getCurrencyByName(String name);
	public List<TCrCurrency> getCurrencyList();
	public void save(TCrCurrency currency);
	public void delete(TCrCurrency currency);
}
