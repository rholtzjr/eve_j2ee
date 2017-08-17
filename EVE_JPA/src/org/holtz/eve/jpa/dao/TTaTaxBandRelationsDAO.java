package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTaTaxBandRelations;

public interface TTaTaxBandRelationsDAO {
	public TTaTaxBandRelations getTaxBandRelationsById(int id);
	public TTaTaxBandRelations getTaxBandRelationsByName(String name);
	public List<TTaTaxBandRelations> getTaxBandRelationsList();
	public void save(TTaTaxBandRelations taxBandRelations);
	public void delete(TTaTaxBandRelations taxBandRelations);
}
