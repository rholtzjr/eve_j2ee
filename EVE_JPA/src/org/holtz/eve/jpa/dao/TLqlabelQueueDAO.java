package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TLqlabelQueue;

public interface TLqlabelQueueDAO {
	public TLqlabelQueue getLabelQueueById(int id);
	public TLqlabelQueue getLabelQueueByName(String name);
	public List<TLqlabelQueue> getLabelQueueList();
	public void save(TLqlabelQueue labelQueue);
	public void delete(TLqlabelQueue labelQueue);
}
