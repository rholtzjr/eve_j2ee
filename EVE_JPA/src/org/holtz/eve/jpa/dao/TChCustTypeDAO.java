package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TChCustType;

public interface TChCustTypeDAO {
	public TChCustType getCustTypeById(int id);
	public TChCustType getCustTypeByName(String name);
	public List<TChCustType> getCustTypeList();
	public void save(TChCustType custType);
	public void delete(TChCustType custType);
}
