package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCnContact;

public interface TCnContactDAO {
	public TCnContact getContactById(int id);
	public TCnContact getContactByName(String name);
	public List<TCnContact> getContactList();
	public void save(TCnContact contact);
	public void delete(TCnContact contact);
}
