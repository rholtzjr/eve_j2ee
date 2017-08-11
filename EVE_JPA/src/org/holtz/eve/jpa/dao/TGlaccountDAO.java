package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TGlaccount;

public interface TGlaccountDAO {
	public TGlaccount getAccountById(int id);
	public TGlaccount getAccountByName(String name);
	public List<TGlaccount> getAccountList();
	public void save(TGlaccount account);
	public void delete(TGlaccount account);
}
