package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TInInvoice;

public interface TInInvoiceDAO {
	public TInInvoice getInvoiceById(int id);
	public TInInvoice getInvoiceByName(String name);
	public List<TInInvoice> getInvoiceList();
	public void save(TInInvoice invoice);
	public void delete(TInInvoice invoice);
}
