package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TAcAccount;

public interface AccountDAO {

	public TAcAccount getAccountById(int id);
	public TAcAccount getAccountByName(String name);
	public List<TAcAccount> getAccountList();
	public void save(TAcAccount account);
	public void delete(TAcAccount account);
	
	
}
