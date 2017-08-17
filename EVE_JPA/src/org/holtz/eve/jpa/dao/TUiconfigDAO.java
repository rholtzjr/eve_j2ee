package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TUiconfig;

public interface TUiconfigDAO {
	public TUiconfig getConfigById(int id);
	public TUiconfig getConfigByName(String name);
	public List<TUiconfig> getConfigList();
	public void save(TUiconfig config);
	public void delete(TUiconfig config);
}
