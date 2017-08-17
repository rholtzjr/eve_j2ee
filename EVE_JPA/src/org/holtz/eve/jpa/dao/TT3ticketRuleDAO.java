package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TT3ticketRule;

public interface TT3ticketRuleDAO {
	public TT3ticketRule getTicketRuleById(int id);
	public TT3ticketRule getTicketRuleByName(String name);
	public List<TT3ticketRule> getTicketRuleList();
	public void save(TT3ticketRule ticketRule);
	public void delete(TT3ticketRule ticketRule);
}
