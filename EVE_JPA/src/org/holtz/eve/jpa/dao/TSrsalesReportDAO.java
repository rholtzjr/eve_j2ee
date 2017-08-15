package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSrsalesReport;

public interface TSrsalesReportDAO {

	public TSrsalesReport getSalesReporById(int id);
	public TSrsalesReport getSalesReporByName(String name);
	public List<TSrsalesReport> getSalesReporList();
	public void save(TSrsalesReport salesReport);
	public void delete(TSrsalesReport salesReport);
}
