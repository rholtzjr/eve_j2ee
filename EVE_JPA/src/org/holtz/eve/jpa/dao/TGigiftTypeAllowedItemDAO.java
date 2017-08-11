package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TGigiftTypeAllowedItem;

public interface TGigiftTypeAllowedItemDAO {
	public TGigiftTypeAllowedItem getGiftTypeAllowedItemById(int id);
	public TGigiftTypeAllowedItem getGiftTypeAllowedItemByName(String name);
	public List<TGigiftTypeAllowedItem> getGiftTypeAllowedItemList();
	public void save(TGigiftTypeAllowedItem giftTypeAllowedItem);
	public void delete(TGigiftTypeAllowedItem giftTypeAllowedItem);
}
