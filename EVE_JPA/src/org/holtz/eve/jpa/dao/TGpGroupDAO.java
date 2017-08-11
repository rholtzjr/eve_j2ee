package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TGpGroup;

public interface TGpGroupDAO {
	public TGpGroup getGroupById(int id);
	public TGpGroup getGroupByName(String name);
	public List<TGpGroup> getGroupList();
	public void save(TGpGroup tgpgroup);
	public void delete(TGpGroup tgpgroup);
}
