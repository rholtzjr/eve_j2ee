package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TExExpense;

public interface TExExpenseDAO {
	public TExExpense getExpenseById(int id);
	public TExExpense getExpenseByName(String name);
	public List<TExExpense> getExpenseList();
	public void save(TExExpense expense);
	public void delete(TExExpense expense);
}
