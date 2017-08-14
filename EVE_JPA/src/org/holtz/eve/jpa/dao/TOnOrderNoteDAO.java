package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TOnOrderNote;

public interface TOnOrderNoteDAO {
	public TOnOrderNote getOrderNoteById(int id);
	public TOnOrderNote getOrderNoteByName(String name);
	public List<TOnOrderNote> getOrderNoteList();
	public void save(TOnOrderNote orderNote);
	public void delete(TOnOrderNote orderNote);
}
