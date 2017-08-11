package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TDpdataPcdefaults;

public interface TDpdataPcdefaultsDAO {
	public TDpdataPcdefaults getDataPcDefaultsById(int id);
	public TDpdataPcdefaults getDataPcDefaultsByName(String name);
	public List<TDpdataPcdefaults> getDataPcDefaultsList();
	public void save(TDpdataPcdefaults dataPcDefaults);
	public void delete(TDpdataPcdefaults dataPcDefaults);
}
