package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TM2menuStatistics;

public interface TM2menuStatisticsDAO {
	public TM2menuStatistics getMenuStatisticsById(int id);
	public TM2menuStatistics getMenuStatisticsByName(String name);
	public List<TM2menuStatistics> getMenuStatisticsList();
	public void save(TM2menuStatistics menuStatistics);
	public void delete(TM2menuStatistics menuStatistics);
}
