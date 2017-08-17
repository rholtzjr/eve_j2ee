package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TVivoucherItem;

public interface TVivoucherItemDAO {

	public TVivoucherItem getVoucherItemById(int id);
	public TVivoucherItem getVoucherItemByName(String name);
	public List<TVivoucherItem> getVoucherItemList();
	public void save(TVivoucherItem voucherItem);
	public void delete(TVivoucherItem voucherItem);
}
