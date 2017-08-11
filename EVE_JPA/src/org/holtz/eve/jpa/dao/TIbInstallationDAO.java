package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIbInstallation;

public interface TIbInstallationDAO {
	public TIbInstallation getInstallationById(int id);
	public TIbInstallation getInstallationByName(String name);
	public List<TIbInstallation> getInstallationList();
	public void save(TIbInstallation installation);
	public void delete(TIbInstallation installation);
}
