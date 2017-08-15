package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TShShortcutDAO;
import org.holtz.eve.jpa.entity.TShShortcut;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TShShortcut;

public class TSistockItemDAOImpl implements TShShortcutDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TSistockItemDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TShShortcut getShortcutById(int id) {
		String queryString = "from TShShortcut shortcut where shortcut.shShortcutId = :id";
		TShShortcut shortcut = new TShShortcut();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		shortcut = (TShShortcut) query.uniqueResult();
		return shortcut;
	}

	@Override
	public TShShortcut getShortcutByName(String name) {
		String queryString = "from TShShortcut shortcut where shortcut.shShortcutTx like CONCAT('%',:name,'%')";
		TShShortcut shortcut = new TShShortcut();
		query = session.createQuery(queryString);
		query.setString("name", name);
		shortcut = (TShShortcut) query.uniqueResult();
		return shortcut;
	}

	@Override
	public List<TShShortcut> getShortcutList() {
		String queryString = "from TShShortcut";
		List<TShShortcut> shortcutList = new ArrayList<TShShortcut>();
		query = session.createQuery(queryString);
		shortcutList = (List<TShShortcut>)query.list();
		return shortcutList;
	}

	@Override
	public void save(TShShortcut shortcut) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TShShortcut shortcut) {
		// TODO Auto-generated method stub

	}

	public SessionFactory getSessionFactory() {
		sessionFactory = HibernateUtil.getSessionFactory();
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
