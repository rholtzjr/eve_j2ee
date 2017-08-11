package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIsissys;

public interface TIsissysDAO {
	public TIsissys getIssysById(int id);
	public TIsissys getIssysByName(String name);
	public List<TIsissys> getIssysList();
	public void save(TIsissys issys);
	public void delete(TIsissys issys);
}
