package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPnPcprinter;

public interface TPnPcprinterDAO {
	public TPnPcprinter getPcprinterById(int id);
	public TPnPcprinter getPcprinterByName(String name);
	public List<TPnPcprinter> getPcprinterList();
	public void save(TPnPcprinter pcprinter);
	public void delete(TPnPcprinter pcprinter);
}
