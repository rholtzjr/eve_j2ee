package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity. TSfStockOffer;

public interface TSfStockOfferDAO {
	public  TSfStockOffer getStockOfferById(int id);
	public  TSfStockOffer getStockOfferByName(String name);
	public List< TSfStockOffer> getStockOfferList();
	public void save( TSfStockOffer stockOffer);
	public void delete( TSfStockOffer stockOffer);
}
