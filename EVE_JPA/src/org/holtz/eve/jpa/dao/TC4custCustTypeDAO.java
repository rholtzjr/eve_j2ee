package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TC4custCustType;

public interface TC4custCustTypeDAO {
	public TC4custCustType getCustCustTypeById(int id);
	public TC4custCustType getCustCustTypeByName(String name);
	public List<TC4custCustType> getCustCustTypeList();
	public void save(TC4custCustType account);
	public void delete(TC4custCustType account);
}
