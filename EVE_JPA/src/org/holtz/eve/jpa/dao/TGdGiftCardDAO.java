package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TGdGiftCard;

public interface TGdGiftCardDAO {
	public TGdGiftCard getGiftCardById(int id);
	public TGdGiftCard getGiftCardByName(String name);
	public List<TGdGiftCard> getGiftCardList();
	public void save(TGdGiftCard giftCard);
	public void delete(TGdGiftCard giftCard);
}
