package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIaimportAttempt;

public interface TIaimportAttemptDAO {
	public TIaimportAttempt getImportAttemptById(int id);
	public TIaimportAttempt getImportAttemptTypeByName(String name);
	public List<TIaimportAttempt> getImportAttemptList();
	public void save(TIaimportAttempt importAttempt);
	public void delete(TIaimportAttempt importAttempt);
}
