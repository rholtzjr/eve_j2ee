package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDcDocument;

public interface TDcDocumentDAO {
	public TDcDocument getDocumentById(int id);
	public TDcDocument getDocumentByName(String name);
	public List<TDcDocument> getDocumentList();
	public void save(TDcDocument document);
	public void delete(TDcDocument document);
}
