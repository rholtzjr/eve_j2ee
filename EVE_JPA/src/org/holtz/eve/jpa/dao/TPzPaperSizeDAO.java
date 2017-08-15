package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPzPaperSize;

public interface TPzPaperSizeDAO {
	public TPzPaperSize getPaperSizeById(int id);
	public TPzPaperSize getPaperSizeByName(String name);
	public List<TPzPaperSize> getPaperSizeList();
	public void save(TPzPaperSize paperSize);
	public void delete(TPzPaperSize paperSize);
}
