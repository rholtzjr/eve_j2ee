package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TNdNode;

public interface TNdNodeDAO {
	public TNdNode getNodeById(int id);
	public TNdNode getNodeByName(String name);
	public List<TNdNode> getNodeList();
	public void save(TNdNode node);
	public void delete(TNdNode node);
}
