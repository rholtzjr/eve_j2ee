package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TC5custEquipment;

public interface TC5custEquipmentDAO {

	public TC5custEquipment getcustEquipmentById(int id);
	public TC5custEquipment getcustEquipmentByName(String name);
	public List<TC5custEquipment> getcustEquipmentList();
	public void save(TC5custEquipment account);
	public void delete(TC5custEquipment account);
}
