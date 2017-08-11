package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEmEmp;

public interface TEmEmpDAO {
	public TEmEmp getEmEmpById(int id);
	public TEmEmp getEmEmpByName(String name);
	public List<TEmEmp> getEmEmpList();
	public void save(TEmEmp emEmp);
	public void delete(TEmEmp emEmp);
}
