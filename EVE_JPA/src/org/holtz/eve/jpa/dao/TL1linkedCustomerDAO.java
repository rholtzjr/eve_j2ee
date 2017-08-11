package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TL1linkedCustomer;

public interface TL1linkedCustomerDAO {
	public TL1linkedCustomer getLinkedCustomerById(int id);
	public TL1linkedCustomer getLinkedCustomerByName(String name);
	public List<TL1linkedCustomer> getLinkedCustomerList();
	public void save(TL1linkedCustomer linkedCustomer);
	public void delete(TL1linkedCustomer linkedCustomer);
}
