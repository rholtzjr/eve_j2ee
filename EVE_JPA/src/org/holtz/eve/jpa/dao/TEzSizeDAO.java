package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEzSize;

public interface TEzSizeDAO {
	public TEzSize getSizeById(int id);
	public TEzSize getSizeByName(String name);
	public List<TEzSize> getSizeList();
	public void save(TEzSize size);
	public void delete(TEzSize size);
}
