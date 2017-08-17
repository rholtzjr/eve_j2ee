package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTdTicketPc;

public interface TTdTicketPcDAO {
	public TTdTicketPc getTicketPcById(int id);
	public TTdTicketPc getTicketPcByName(String name);
	public List<TTdTicketPc> getTicketPcList();
	public void save(TTdTicketPc ticketPc);
	public void delete(TTdTicketPc ticketPc);
}
