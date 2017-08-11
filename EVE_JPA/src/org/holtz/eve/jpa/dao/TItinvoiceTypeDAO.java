package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TItinvoiceType;

public interface TItinvoiceTypeDAO {
	public TItinvoiceType getInvoiceTypeById(int id);
	public TItinvoiceType getInvoiceTypeByName(String name);
	public List<TItinvoiceType> getInvoiceTypeList();
	public void save(TItinvoiceType invoiceType);
	public void delete(TItinvoiceType invoiceType);
}
