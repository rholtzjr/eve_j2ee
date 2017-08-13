package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TMaMessagingMailer;

public interface TMaMessagingMailerDAO {
	public TMaMessagingMailer getMessagingMailerById(int id);
	public TMaMessagingMailer getMessagingMailerByName(String name);
	public List<TMaMessagingMailer> getMessagingMailerList();
	public void save(TMaMessagingMailer messagingMailer);
	public void delete(TMaMessagingMailer messagingMailer);
}
