package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDyDocumentLinkType;

public interface TDyDocumentLinkTypeDAO {
	public TDyDocumentLinkType getDocumentLinkTypeById(int id);
	public TDyDocumentLinkType getDocumentLinkTypeByName(String name);
	public List<TDyDocumentLinkType> getDocumentLinkTypeList();
	public void save(TDyDocumentLinkType documentLinkType);
	public void delete(TDyDocumentLinkType documentLinkType);
}
