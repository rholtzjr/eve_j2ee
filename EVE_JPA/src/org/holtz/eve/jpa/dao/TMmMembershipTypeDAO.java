package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TMmMembershipType;

public interface TMmMembershipTypeDAO {
	public TMmMembershipType getMembershipTypeById(int id);
	public TMmMembershipType getMembershipTypeByName(String name);
	public List<TMmMembershipType> getMembershipTypeList();
	public void save(TMmMembershipType membershipType);
	public void delete(TMmMembershipType membershipType);
}
