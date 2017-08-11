package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TE5emailFilter;

public interface TE5emailFilterDAO {
	public TE5emailFilter getEmailFilterById(int id);
	public TE5emailFilter getEmailFilterByName(String name);
	public List<TE5emailFilter> getEmailFilterList();
	public void save(TE5emailFilter emailFilter);
	public void delete(TE5emailFilter emailFilter);
}
