package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TMnMenuDAO;
import org.holtz.eve.jpa.entity.TMnMenu;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TMnMenu;

public class TMnMenuDAOImpl implements TMnMenuDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TMnMenuDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TMnMenu getMenuById(int id) {
		String queryString = "from TMnMenu menu where menu.mnMenuId = :id";
		TMnMenu menu = new TMnMenu();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		menu = (TMnMenu) query.uniqueResult();
		return menu;
	}

	@Override
	public TMnMenu getMenuByName(String name) {
		String queryString = "from TMnMenu menu where menu.mnMenuText like CONCAT('%',:name,'%')";
		TMnMenu menu = new TMnMenu();
		query = session.createQuery(queryString);
		query.setString("name", name);
		menu = (TMnMenu) query.uniqueResult();
		return menu;
	}

	@Override
	public List<TMnMenu> getMenuList() {
		String queryString = "from TMnMenu";
		List<TMnMenu> menuList = new ArrayList<TMnMenu>();
		query = session.createQuery(queryString);
		menuList = (List<TMnMenu>)query.list();
		return menuList;
	}

	@Override
	public void save(TMnMenu menu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TMnMenu menu) {
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
