package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TSmStockOfferItem;

public interface TSmStockOfferItemDAO {
	public TSmStockOfferItem getStockOfferItemById(int id);
	public TSmStockOfferItem getStockOfferItemByName(String name);
	public List<TSmStockOfferItem> getStockOfferItemList();
	public void save(TSmStockOfferItem stockOfferItem);
	public void delete(TSmStockOfferItem stockOfferItem);
}
