package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TRySectionType;

public interface TRySectionTypeDAO {
	public TRySectionType getSectionTypeById(int id);
	public TRySectionType getSectionTypeByName(String name);
	public List<TRySectionType> getSectionTypeList();
	public void save(TRySectionType sectionType);
	public void delete(TRySectionType sectionType);
}
