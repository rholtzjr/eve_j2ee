package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TT2tripExpense;

public interface TT2tripExpenseDAO {

	public TT2tripExpense getTripExpenseById(int id);
	public TT2tripExpense getTripExpenseByName(String name);
	public List<TT2tripExpense> getTripExpenseList();
	public void save(TT2tripExpense tripExpense);
	public void delete(TT2tripExpense tripExpense);
}
