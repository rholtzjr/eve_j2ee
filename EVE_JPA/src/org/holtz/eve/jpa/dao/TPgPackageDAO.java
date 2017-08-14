package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPgPackage;

public interface TPgPackageDAO {
	public TPgPackage getPackageById(int id);
	public TPgPackage getPackageByName(String name);
	public List<TPgPackage> getPackageList();
	public void save(TPgPackage tpgpackage);
	public void delete(TPgPackage tpgpackage);
}
