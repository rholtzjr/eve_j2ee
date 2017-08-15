package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPtpaymentType;

public interface TPtpaymentTypeDAO {
	public TPtpaymentType getPaymentTypeById(int id);
	public TPtpaymentType getPaymentTypeByName(String name);
	public List<TPtpaymentType> getPaymentTypeList();
	public void save(TPtpaymentType paymentType);
	public void delete(TPtpaymentType paymentType);
}
