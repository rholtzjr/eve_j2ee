package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRsreportSectionDefaults;

public interface TRsreportSectionDefaultsDAO {
	public TRsreportSectionDefaults getReportSectionDefaultsById(int id);
	public TRsreportSectionDefaults getReportSectionDefaultsByName(String name);
	public List<TRsreportSectionDefaults> getReportSectionDefaultsList();
	public void save(TRsreportSectionDefaults reportSectionDefaults);
	public void delete(TRsreportSectionDefaults reportSectionDefaults);
}
