package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPaPodeliveryItem;

public interface TPaPodeliveryItemDAO {
	public TPaPodeliveryItem getPodeliveryItemById(int id);
	public TPaPodeliveryItem getPodeliveryItemByName(String name);
	public List<TPaPodeliveryItem> getPodeliveryItemList();
	public void save(TPaPodeliveryItem podeliveryItem);
	public void delete(TPaPodeliveryItem podeliveryItem);
}
