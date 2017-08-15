package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRfreportFieldDefaults;

public interface TRfreportFieldDefaultsDAO {

	public TRfreportFieldDefaults getReportFieldDefaultsById(int id);
	public TRfreportFieldDefaults getReportFieldDefaultsByName(String name);
	public List<TRfreportFieldDefaults> getReportFieldDefaultsList();
	public void save(TRfreportFieldDefaults reportFieldDefaults);
	public void delete(TRfreportFieldDefaults reportFieldDefaults);
}
