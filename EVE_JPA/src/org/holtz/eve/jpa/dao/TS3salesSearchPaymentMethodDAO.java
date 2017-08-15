package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TS3salesSearchPaymentMethod;

public interface TS3salesSearchPaymentMethodDAO {
	public TS3salesSearchPaymentMethod getSalesSearchPaymentMethodById(int id);
	public TS3salesSearchPaymentMethod getSalesSearchPaymentMethodByName(String name);
	public List<TS3salesSearchPaymentMethod> getSalesSearchPaymentMethodList();
	public void save(TS3salesSearchPaymentMethod salesSearchPaymentMethod);
	public void delete(TS3salesSearchPaymentMethod salesSearchPaymentMethod);
}
