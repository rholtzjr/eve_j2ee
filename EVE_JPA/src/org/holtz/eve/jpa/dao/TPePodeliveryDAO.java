package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TPePodelivery;

public interface TPePodeliveryDAO {
	public TPePodelivery getPodeliveryById(int id);
	public TPePodelivery getPodeliveryByName(String name);
	public List<TPePodelivery> getPodeliveryList();
	public void save(TPePodelivery podelivery);
	public void delete(TPePodelivery podelivery);
}
