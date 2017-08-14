package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPfProfitCenter;

public interface TPfProfitCenterDAO {

	public TPfProfitCenter getProfitCenterById(int id);
	public TPfProfitCenter getProfitCenterByName(String name);
	public List<TPfProfitCenter> getProfitCenterList();
	public void save(TPfProfitCenter profitCenter);
	public void delete(TPfProfitCenter profitCenter);
}
