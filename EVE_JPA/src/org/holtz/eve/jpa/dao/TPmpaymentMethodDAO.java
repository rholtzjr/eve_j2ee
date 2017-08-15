package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPmpaymentMethod;

public interface TPmpaymentMethodDAO {
	public TPmpaymentMethod getPaymentMethodById(int id);
	public TPmpaymentMethod getPaymentMethodByName(String name);
	public List<TPmpaymentMethod> getPaymentMethodList();
	public void save(TPmpaymentMethod paymentMethod);
	public void delete(TPmpaymentMethod paymentMethod);
}
