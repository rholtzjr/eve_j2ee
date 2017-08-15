package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPvPoinvoice;

public interface TPvPoinvoiceDAO {
	public TPvPoinvoice getPoinvoiceById(int id);
	public TPvPoinvoice getPoinvoiceByName(String name);
	public List<TPvPoinvoice> getPoinvoiceList();
	public void save(TPvPoinvoice poinvoice);
	public void delete(TPvPoinvoice poinvoice);
}
