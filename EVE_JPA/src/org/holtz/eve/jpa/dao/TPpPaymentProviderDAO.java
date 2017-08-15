package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPpPaymentProvider;

public interface TPpPaymentProviderDAO {
	public TPpPaymentProvider getPaymentProviderById(int id);
	public TPpPaymentProvider getPaymentProviderByName(String name);
	public List<TPpPaymentProvider> getPaymentProviderList();
	public void save(TPpPaymentProvider paymentProvider);
	public void delete(TPpPaymentProvider paymentProvider);
}
