package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TE2emailQueue;

public interface TE2emailQueueDAO {
	public TE2emailQueue getEmailQueueById(int id);
	public TE2emailQueue getEmailQueueByName(String name);
	public List<TE2emailQueue> getEmailQueueList();
	public void save(TE2emailQueue emailQueue);
	public void delete(TE2emailQueue emailQueue);
}
