package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRfreportField;

public interface TRfreportFieldDAO {
	public TRfreportField getReportFieldById(int id);
	public TRfreportField getReportFieldByName(String name);
	public List<TRfreportField> getReportFieldList();
	public void save(TRfreportField reportField);
	public void delete(TRfreportField reportField);
}
