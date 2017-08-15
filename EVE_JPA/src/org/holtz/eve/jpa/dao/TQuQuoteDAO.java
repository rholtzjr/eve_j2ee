package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TQuQuote;

public interface TQuQuoteDAO {
	public TQuQuote getQuoteById(int id);
	public TQuQuote getQuoteByName(String name);
	public List<TQuQuote> getQuoteList();
	public void save(TQuQuote quote);
	public void delete(TQuQuote quote);
}
