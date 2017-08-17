package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTmTaskStatus;

public interface TTmTaskStatusDAO {
	public TTmTaskStatus getTaskStatusById(int id);
	public TTmTaskStatus getTaskStatusByName(String name);
	public List<TTmTaskStatus> getTaskStatusList();
	public void save(TTmTaskStatus taskStatus);
	public void delete(TTmTaskStatus taskStatus);
}
