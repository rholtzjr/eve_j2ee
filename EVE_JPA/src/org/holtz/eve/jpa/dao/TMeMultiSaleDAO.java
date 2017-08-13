package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TMeMultiSale;

public interface TMeMultiSaleDAO {
	public TMeMultiSale getMultiSaleById(int id);
	public TMeMultiSale getMultiSaleByName(String name);
	public List<TMeMultiSale> getMultiSaleList();
	public void save(TMeMultiSale multiSale);
	public void delete(TMeMultiSale multiSale);
}
