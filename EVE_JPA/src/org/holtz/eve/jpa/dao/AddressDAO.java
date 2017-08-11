package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TAdAddress;

public interface AddressDAO {
	
	public TAdAddress getAddressById(int id);
	public TAdAddress getAddressByName(String name);
	public List<TAdAddress> getAddressList();
	public void save(TAdAddress account);
	public void delete(TAdAddress account);

}
