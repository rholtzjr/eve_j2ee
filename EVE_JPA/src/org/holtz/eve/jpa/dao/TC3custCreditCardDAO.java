package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TC3custCreditCard;

public interface TC3custCreditCardDAO {

	public TC3custCreditCard getCustCCById(int id);
	public TC3custCreditCard getCustCCByLastName(String name);
	public List<TC3custCreditCard> getCustCCList();
	public void save(TC3custCreditCard custCard);
	public void delete(TC3custCreditCard custCard);
}
