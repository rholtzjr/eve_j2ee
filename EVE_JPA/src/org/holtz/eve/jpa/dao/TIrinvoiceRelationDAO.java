package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIrinvoiceRelation;

public interface TIrinvoiceRelationDAO {
	public TIrinvoiceRelation getInvoiceRelationById(int id);
	public TIrinvoiceRelation getInvoiceRelationByName(String name);
	public List<TIrinvoiceRelation> getInvoiceRelationList();
	public void save(TIrinvoiceRelation invoiceRelation);
	public void delete(TIrinvoiceRelation invoiceRelation);
}
