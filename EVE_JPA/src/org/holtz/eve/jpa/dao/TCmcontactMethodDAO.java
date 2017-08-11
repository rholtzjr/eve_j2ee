package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCmcontactMethod;

public interface TCmcontactMethodDAO {
	public TCmcontactMethod getContactMethodById(int id);
	public TCmcontactMethod getContactMethodByName(String name);
	public List<TCmcontactMethod> getContactMethodList();
	public void save(TCmcontactMethod contactMethod);
	public void delete(TCmcontactMethod contactMethod);

}
