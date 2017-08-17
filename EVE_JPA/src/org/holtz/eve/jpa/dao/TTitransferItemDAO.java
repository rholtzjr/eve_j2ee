package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTitransferItem;

public interface TTitransferItemDAO {
	public TTitransferItem getTransferItemById(int id);
	public TTitransferItem getTransferItemByName(String name);
	public List<TTitransferItem> getTransferItemList();
	public void save(TTitransferItem transferItem);
	public void delete(TTitransferItem transferItem);
}
