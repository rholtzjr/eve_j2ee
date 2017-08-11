package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDpdataPc;

public interface TDpdataPcDAO {
	public TDpdataPc getDataPcById(int id);
	public TDpdataPc getDataPcByName(String name);
	public List<TDpdataPc> getDataPcList();
	public void save(TDpdataPc dataPc);
	public void delete(TDpdataPc dataPc);
}
