package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TAyAccountPayment;

public interface AccountPaymentDAO {
	public TAyAccountPayment getAccountPaymentById(int id);
	public TAyAccountPayment getAccountPaymentByName(String name);
	public List<TAyAccountPayment> getAccountPaymentList();
	public void save(TAyAccountPayment accountPayment);
	public void delete(TAyAccountPayment accountPayment);
	
}
