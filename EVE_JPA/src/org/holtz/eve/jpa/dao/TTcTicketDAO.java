package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTcTicket;

public interface TTcTicketDAO {

	public TTcTicket getTicketById(int id);
	public TTcTicket getTicketByName(String name);
	public List<TTcTicket> getTicketList();
	public void save(TTcTicket ticket);
	public void delete(TTcTicket ticket);
}
