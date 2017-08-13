package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TMgMessage;

public interface TMgMessageDAO {
	public TMgMessage getMessageById(int id);
	public TMgMessage getMessageByName(String name);
	public List<TMgMessage> getMessageList();
	public void save(TMgMessage message);
	public void delete(TMgMessage message);
}
