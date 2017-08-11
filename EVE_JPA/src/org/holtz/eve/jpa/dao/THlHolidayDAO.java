package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.THlHoliday;

public interface THlHolidayDAO {
	public THlHoliday getAccountById(int id);
	public THlHoliday getAccountByName(String name);
	public List<THlHoliday> getAccountList();
	public void save(THlHoliday holiday);
	public void delete(THlHoliday holiday);
}
