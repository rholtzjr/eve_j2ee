package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TMsmaritalStatus;

public interface TMsmaritalStatusDAO {
	public TMsmaritalStatus getMaritalStatusById(int id);
	public TMsmaritalStatus getMaritalStatusByName(String name);
	public List<TMsmaritalStatus> getMaritalStatusList();
	public void save(TMsmaritalStatus maritalStatus);
	public void delete(TMsmaritalStatus maritalStatus);
}
