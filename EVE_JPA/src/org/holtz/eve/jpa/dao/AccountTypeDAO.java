package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TAtaccountType;

public interface AccountTypeDAO {

	public TAtaccountType getAccountTypeById(int id);
	public TAtaccountType getAccountTypeByName(String name);
	public List<TAtaccountType> getAccountTypeList();
	public void save(TAtaccountType accountType);
	public void delete(TAtaccountType accountType);
}
