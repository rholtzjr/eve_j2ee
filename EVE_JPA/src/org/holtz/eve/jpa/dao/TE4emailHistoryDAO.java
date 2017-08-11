package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TE4emailHistory;

public interface TE4emailHistoryDAO {
	public TE4emailHistory getEmailHistoryById(int id);
	public TE4emailHistory getEmailHistoryByName(String name);
	public List<TE4emailHistory> getEmailHistoryList();
	public void save(TE4emailHistory emailHistory);
	public void delete(TE4emailHistory emailHistory);
}
