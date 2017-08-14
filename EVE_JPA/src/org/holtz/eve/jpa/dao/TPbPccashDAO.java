package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPbPccash;

public interface TPbPccashDAO {

	public TPbPccash getPccashById(int id);
	public TPbPccash getPccashByName(String name);
	public List<TPbPccash> getPccashList();
	public void save(TPbPccash pccash);
	public void delete(TPbPccash pccash);
}
