package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TMlmailingList;

public interface TMlmailingListDAO {
	public TMlmailingList getMailingListById(int id);
	public TMlmailingList getMailingListByName(String name);
	public List<TMlmailingList> getMailingListList();
	public void save(TMlmailingList mailingList);
	public void delete(TMlmailingList mailingList);
}
