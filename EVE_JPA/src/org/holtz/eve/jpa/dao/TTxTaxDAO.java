package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTxTax;

public interface TTxTaxDAO {
	public TTxTax getTaxById(int id);
	public TTxTax getTaxByName(String name);
	public List<TTxTax> getTaxList();
	public void save(TTxTax tax);
	public void delete(TTxTax tax);
}
