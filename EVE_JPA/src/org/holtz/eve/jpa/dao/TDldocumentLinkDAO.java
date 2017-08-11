package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDldocumentLink;

public interface TDldocumentLinkDAO {
	public TDldocumentLink getDocumentLinkById(int id);
	public TDldocumentLink getDocumentLinkByName(String name);
	public List<TDldocumentLink> getDocumentLinkList();
	public void save(TDldocumentLink documentLink);
	public void delete(TDldocumentLink documentLink);
}
