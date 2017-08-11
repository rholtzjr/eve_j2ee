package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TCvCustTypeDiscountBand;

public interface TCvCustTypeDiscountBandDAO {
	public TCvCustTypeDiscountBand getCustTypeDiscountBandById(int id);
	public TCvCustTypeDiscountBand getCustTypeDiscountBandByName(String name);
	public List<TCvCustTypeDiscountBand> getCustTypeDiscountBandList();
	public void save(TCvCustTypeDiscountBand ctdb);
	public void delete(TCvCustTypeDiscountBand ctdb);
}
