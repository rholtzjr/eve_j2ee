package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TGtgiftCardType;

public interface TGtgiftCardTypeDAO {
	public TGtgiftCardType getGiftCardTypeById(int id);
	public TGtgiftCardType getGiftCardTypeByName(String name);
	public List<TGtgiftCardType> getGiftCardTypeList();
	public void save(TGtgiftCardType giftCardType);
	public void delete(TGtgiftCardType giftCardType);
}
