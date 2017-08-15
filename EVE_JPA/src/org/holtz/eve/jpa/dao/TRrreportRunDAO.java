package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRrreportRun;

public interface TRrreportRunDAO {
	public TRrreportRun getReportRunById(int id);
	public TRrreportRun getReportRunByName(String name);
	public List<TRrreportRun> getReportRunList();
	public void save(TRrreportRun reportRun);
	public void delete(TRrreportRun reportRun);
}
