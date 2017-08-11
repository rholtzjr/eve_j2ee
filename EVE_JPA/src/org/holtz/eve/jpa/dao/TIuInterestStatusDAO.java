package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIuInterestStatus;

public interface TIuInterestStatusDAO {
	public TIuInterestStatus getInterestStatusById(int id);
	public TIuInterestStatus getInterestStatusByName(String name);
	public List<TIuInterestStatus> getInterestStatusList();
	public void save(TIuInterestStatus interestStatus);
	public void delete(TIuInterestStatus interestStatus);
}
