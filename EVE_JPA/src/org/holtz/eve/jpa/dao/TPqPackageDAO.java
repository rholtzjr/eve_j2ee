package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPqPackage;

public interface TPqPackageDAO {
	public TPqPackage getPackageById(int id);
	public TPqPackage getPackageByName(String name);
	public List<TPqPackage> getPackageList();
	public void save(TPqPackage tpqpackage);
	public void delete(TPqPackage tpqpackage);
}
