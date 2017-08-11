package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIsinvoiceTypeStore;

public interface TIsinvoiceTypeStoreDAO {
	public TIsinvoiceTypeStore getInvoiceTypeStoreById(int id);
	public TIsinvoiceTypeStore getInvoiceTypeStoreByName(String name);
	public List<TIsinvoiceTypeStore> getInvoiceTypeStoreList();
	public void save(TIsinvoiceTypeStore invoiceTypeStore);
	public void delete(TIsinvoiceTypeStore invoiceTypeStore);
}
