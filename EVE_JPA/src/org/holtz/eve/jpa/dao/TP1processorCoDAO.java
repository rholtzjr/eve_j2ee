package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TP1processorCo;

public interface TP1processorCoDAO {
	public TP1processorCo getProcessorCoById(int id);
	public TP1processorCo getProcessorCoByName(String name);
	public List<TP1processorCo> getProcessorCoList();
	public void save(TP1processorCo processorCo);
	public void delete(TP1processorCo processorCo);
}
