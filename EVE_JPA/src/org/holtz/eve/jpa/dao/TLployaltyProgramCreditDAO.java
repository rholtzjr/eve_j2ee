package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TLployaltyProgramCredit;

public interface TLployaltyProgramCreditDAO {
	public TLployaltyProgramCredit getLoyaltyProgramCreditById(int id);
	public TLployaltyProgramCredit getLoyaltyProgramCreditByName(String name);
	public List<TLployaltyProgramCredit> getLoyaltyProgramCreditList();
	public void save(TLployaltyProgramCredit loyaltyProgramCredit);
	public void delete(TLployaltyProgramCredit loyaltyProgramCredit);
}
