package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRgreportGroup;

public interface TRgreportGroupDAO {
	public TRgreportGroup getReportGroupById(int id);
	public TRgreportGroup getReportGroupByName(String name);
	public List<TRgreportGroup> getReportGroupList();
	public void save(TRgreportGroup reportGroup);
	public void delete(TRgreportGroup reportGroup);
}
