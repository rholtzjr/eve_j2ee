package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRlreportLayoutDefaults;

public interface TRlreportLayoutDefaultsDAO {
	public TRlreportLayoutDefaults getReportLayoutDefaultsById(int id);
	public TRlreportLayoutDefaults getReportLayoutDefaultsByName(String name);
	public List<TRlreportLayoutDefaults> getReportLayoutDefaultsList();
	public void save(TRlreportLayoutDefaults reportLayoutDefaults);
	public void delete(TRlreportLayoutDefaults reportLayoutDefaults);
}
