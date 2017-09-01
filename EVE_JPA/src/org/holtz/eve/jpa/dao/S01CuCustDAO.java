package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.S01CuCust;

public interface S01CuCustDAO {
	public S01CuCust getCuCustById(int id);
	public S01CuCust getCuCustByName(String name);
	public List<S01CuCust> getCuCustList();
	public void save(S01CuCust cuCust);
	public void delete(S01CuCust cuCust);
	
}
