package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TOponlineProcessor;

public interface TOponlineProcessorDAO {
	public TOponlineProcessor getOnlineProcessorById(int id);
	public TOponlineProcessor getOnlineProcessorByName(String name);
	public List<TOponlineProcessor> getOnlineProcessorList();
	public void save(TOponlineProcessor onlineProcessor);
	public void delete(TOponlineProcessor onlineProcessor);
}
