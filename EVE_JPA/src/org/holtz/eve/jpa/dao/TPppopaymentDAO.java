package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPppopayment;

public interface TPppopaymentDAO {
	public TPppopayment getPopaymentById(int id);
	public TPppopayment getPopaymentByName(String name);
	public List<TPppopayment> getPopaymentList();
	public void save(TPppopayment popayment);
	public void delete(TPppopayment popayment);
}
