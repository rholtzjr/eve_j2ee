package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TIfinterestFollowUp;

public interface TIfinterestFollowUpDAO {
	public TIfinterestFollowUp getInterestFollowUpById(int id);
	public TIfinterestFollowUp getInterestFollowUpByName(String name);
	public List<TIfinterestFollowUp> getInterestFollowUpList();
	public void save(TIfinterestFollowUp interestFollowUp);
	public void delete(TIfinterestFollowUp interestFollowUp);
}
