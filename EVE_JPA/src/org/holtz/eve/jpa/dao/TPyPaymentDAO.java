package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPyPayment;

public interface TPyPaymentDAO {
	public TPyPayment getPaymentById(int id);
	public TPyPayment getPaymentByName(String name);
	public List<TPyPayment> getPaymentList();
	public void save(TPyPayment payment);
	public void delete(TPyPayment payment);
}
