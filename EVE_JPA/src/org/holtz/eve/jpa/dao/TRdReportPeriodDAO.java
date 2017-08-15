package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRdReportPeriod;

public interface TRdReportPeriodDAO {
	public TRdReportPeriod getReportPeriodById(int id);
	public TRdReportPeriod getReportPeriodByName(String name);
	public List<TRdReportPeriod> getReportPeriodList();
	public void save(TRdReportPeriod reportPeriod);
	public void delete(TRdReportPeriod reportPeriod);
}
