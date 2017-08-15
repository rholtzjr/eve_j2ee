package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRlreportLayout;

public interface TRlreportLayoutDAO {
	public TRlreportLayout getReportLayoutById(int id);
	public TRlreportLayout getReportLayoutByName(String name);
	public List<TRlreportLayout> getReportLayoutList();
	public void save(TRlreportLayout reportLayout);
	public void delete(TRlreportLayout reportLayout);
}
