package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDnDenomination;

public interface TDnDenominationDAO {
	public TDnDenomination getDenominationById(int id);
	public TDnDenomination getDenominationByName(String name);
	public List<TDnDenomination> getDenominationList();
	public void save(TDnDenomination denomination);
	public void delete(TDnDenomination denomination);
}
