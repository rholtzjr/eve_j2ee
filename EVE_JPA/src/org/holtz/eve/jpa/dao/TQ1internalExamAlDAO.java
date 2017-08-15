package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TQ1internalExamAl;

public interface TQ1internalExamAlDAO {
	public TQ1internalExamAl getInternalExamAlById(int id);
	public TQ1internalExamAl getInternalExamAlByName(String name);
	public List<TQ1internalExamAl> getInternalExamAlList();
	public void save(TQ1internalExamAl internalExamAl);
	public void delete(TQ1internalExamAl internalExamAl);
}
