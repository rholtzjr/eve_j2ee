package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIeitemCommission;

public interface TIeitemCommissionDAO {
	public TIeitemCommission getItemCommissionById(int id);
	public TIeitemCommission getItemCommissionByName(String name);
	public List<TIeitemCommission> getItemCommissionList();
	public void save(TIeitemCommission itemCommission);
	public void delete(TIeitemCommission itemCommission);
}
