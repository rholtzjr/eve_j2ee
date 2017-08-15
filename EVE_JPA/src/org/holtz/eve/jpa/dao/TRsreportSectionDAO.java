package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRsreportSection;

public interface TRsreportSectionDAO {
	public TRsreportSection getReportSectionById(int id);
	public TRsreportSection getReportSectionByName(String name);
	public List<TRsreportSection> getReportSectionList();
	public void save(TRsreportSection reportSection);
	public void delete(TRsreportSection reportSection);
}
