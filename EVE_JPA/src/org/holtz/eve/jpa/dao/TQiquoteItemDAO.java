package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TQiquoteItem;

public interface TQiquoteItemDAO {
	public TQiquoteItem getQuoteItemById(int id);
	public TQiquoteItem getQuoteItemByName(String name);
	public List<TQiquoteItem> getQuoteItemList();
	public void save(TQiquoteItem quoteItem);
	public void delete(TQiquoteItem quoteItem);
}
