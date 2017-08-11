package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TE3emailAgent;

public interface TE3emailAgentDAO {
	public TE3emailAgent getEmailAgentById(int id);
	public TE3emailAgent getEmailAgentByName(String name);
	public List<TE3emailAgent> getEmailAgentList();
	public void save(TE3emailAgent emailAgent);
	public void delete(TE3emailAgent emailAgent);
}
