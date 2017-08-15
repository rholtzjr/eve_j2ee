package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TQ2internalExamSt;

public interface TQ2internalExamStDAO {
	public TQ2internalExamSt getInternalExamStById(int id);
	public TQ2internalExamSt getInternalExamStByName(String name);
	public List<TQ2internalExamSt> getInternalExamStList();
	public void save(TQ2internalExamSt internalExamSt);
	public void delete(TQ2internalExamSt internalExamSt);
}
