package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTstransStatus;

public interface TTstransStatusDAO {
	public TTstransStatus getTransStatusById(int id);
	public TTstransStatus getTransStatusByName(String name);
	public List<TTstransStatus> getTransStatusList();
	public void save(TTstransStatus transStatus);
	public void delete(TTstransStatus transStatus);
}
