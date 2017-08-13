package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TMimultiSaleItem;

public interface TMimultiSaleItemDAO {
	public TMimultiSaleItem getMultiSaleItemById(int id);
	public TMimultiSaleItem getMultiSaleItemByName(String name);
	public List<TMimultiSaleItem> getMultiSaleItemList();
	public void save(TMimultiSaleItem multiSaleItem);
	public void delete(TMimultiSaleItem multiSaleItem);
}
