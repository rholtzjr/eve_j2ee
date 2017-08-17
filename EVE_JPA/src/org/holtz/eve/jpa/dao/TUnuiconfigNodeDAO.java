package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TUnuiconfigNode;

public interface TUnuiconfigNodeDAO {
	public TUnuiconfigNode getUiconfigNodeById(int id);
	public TUnuiconfigNode getUiconfigNodeByName(String name);
	public List<TUnuiconfigNode> getUiconfigNodeList();
	public void save(TUnuiconfigNode uiconfigNode);
	public void delete(TUnuiconfigNode uiconfigNode);
}
