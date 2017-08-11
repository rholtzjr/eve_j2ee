package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIiinvoiceItem;

public interface TIiinvoiceItemDAO {
	public TIiinvoiceItem getInvoiceItemById(int id);
	public TIiinvoiceItem getInvoiceItemByName(String name);
	public List<TIiinvoiceItem> getInvoiceItemList();
	public void save(TIiinvoiceItem invoiceItem);
	public void delete(TIiinvoiceItem invoiceItem);
}
