package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TP4piccard;

public interface TP4piccardDAO {
	public TP4piccard getPiccardById(int id);
	public TP4piccard getPiccardByName(String name);
	public List<TP4piccard> getPiccardList();
	public void save(TP4piccard piccard);
	public void delete(TP4piccard piccard);
}
