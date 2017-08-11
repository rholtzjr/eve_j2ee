package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEqEquipment;

public interface TEqEquipmentDAO {
	public TEqEquipment getEquipmentById(int id);
	public TEqEquipment getEquipmentByName(String name);
	public List<TEqEquipment> getEquipmentList();
	public void save(TEqEquipment equipment);
	public void delete(TEqEquipment equipment);
}
