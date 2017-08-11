package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEcempModuleCost;

public interface TEcempModuleCostDAO {
	public TEcempModuleCost getEmpModuleCostById(int id);
	public TEcempModuleCost getEmpModuleCostByName(String name);
	public List<TEcempModuleCost> getEmpModuleCostList();
	public void save(TEcempModuleCost empModuleCost);
	public void delete(TEcempModuleCost empModuleCost);
}
