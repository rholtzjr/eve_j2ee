package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.S01InInvoice;

public interface S01InInvoiceDAO {
	public S01InInvoice getInInvoiceById(int id);
	public S01InInvoice getInInvoiceByName(String name);
	public List<S01InInvoice> getInInvoiceList();
	public void save(S01InInvoice inInvoice);
	public void delete(S01InInvoice inInvoice);
	
}
