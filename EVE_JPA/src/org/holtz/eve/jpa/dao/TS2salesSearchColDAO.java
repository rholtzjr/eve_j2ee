package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TS2salesSearchCol;

public interface TS2salesSearchColDAO {
	public TS2salesSearchCol getSalesSearchColById(int id);
	public TS2salesSearchCol getSalesSearchColByName(String name);
	public List<TS2salesSearchCol> getSalesSearchColList();
	public void save(TS2salesSearchCol salesSearchCol);
	public void delete(TS2salesSearchCol salesSearchCol);
}
