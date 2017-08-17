package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTkTask;

public interface TTkTaskDAO {
	public TTkTask getTaskById(int id);
	public TTkTask getTaskByName(String name);
	public List<TTkTask> getTaskList();
	public void save(TTkTask task);
	public void delete(TTkTask task);
}
