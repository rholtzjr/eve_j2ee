package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TP6picsendCardTo;

public interface TP6picsendCardToDAO {
	public TP6picsendCardTo getPicsendCardToById(int id);
	public TP6picsendCardTo getPicsendCardToByName(String name);
	public List<TP6picsendCardTo> getPicsendCardToList();
	public void save(TP6picsendCardTo picsendCardTo);
	public void delete(TP6picsendCardTo picsendCardTo);
}
