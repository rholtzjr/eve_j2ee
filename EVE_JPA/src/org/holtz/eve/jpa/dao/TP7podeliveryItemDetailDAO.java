package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TP7podeliveryItemDetail;

public interface TP7podeliveryItemDetailDAO {
	public TP7podeliveryItemDetail getPodeliveryItemDetailById(int id);
	public TP7podeliveryItemDetail getPodeliveryItemDetailByName(String name);
	public List<TP7podeliveryItemDetail> getPodeliveryItemDetailList();
	public void save(TP7podeliveryItemDetail podeliveryItemDetail);
	public void delete(TP7podeliveryItemDetail podeliveryItemDetail);
}
