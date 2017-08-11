package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TEuEquipmentRentalPrice;

public interface TEuEquipmentRentalPriceDAO {
	public TEuEquipmentRentalPrice getEquipmentRentalPriceById(int id);
	public TEuEquipmentRentalPrice getEquipmentRentalPriceByName(String name);
	public List<TEuEquipmentRentalPrice> getEquipmentRentalPriceList();
	public void save(TEuEquipmentRentalPrice equipmentRentalPrice);
	public void delete(TEuEquipmentRentalPrice equipmentRentalPrice);
}
