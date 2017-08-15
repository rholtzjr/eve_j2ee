package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRtreportType;

public interface TRtreportTypeDAO {
	public TRtreportType getReportTypeById(int id);
	public TRtreportType getReportTypeByName(String name);
	public List<TRtreportType> getReportTypeList();
	public void save(TRtreportType reportType);
	public void delete(TRtreportType reportType);
}
