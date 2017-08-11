package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TDmdataTypeMenuDAO;
import org.holtz.eve.jpa.entity.TDmdataTypeMenu;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TDmdataTypeMenu;

public class TDmdataTypeMenuDAOImpl implements TDmdataTypeMenuDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TDmdataTypeMenuDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TDmdataTypeMenu getDataTypeMenuById(int id) {
		String queryString = "from TDmdataTypeMenu dataTypeMenu where dataTypeMenu.dmdataTypeMenuId = :id";
		TDmdataTypeMenu dataTypeMenu = new TDmdataTypeMenu();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		dataTypeMenu = (TDmdataTypeMenu) query.uniqueResult();
		return dataTypeMenu;
	}

	@Override
	public TDmdataTypeMenu getDataTypeMenuByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TDmdataTypeMenu dataTypeMenu where dataTypeMenu. like CONCAT('%',:name,'%')";
//		TDmdataTypeMenu dataTypeMenu = new TDmdataTypeMenu();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		dataTypeMenu = (TDmdataTypeMenu) query.uniqueResult();
//		return dataTypeMenu;
	}

	@Override
	public List<TDmdataTypeMenu> getDataTypeMenuList() {
		String queryString = "from TDmdataTypeMenu";
		List<TDmdataTypeMenu> dataTypeMenuList = new ArrayList<TDmdataTypeMenu>();
		query = session.createQuery(queryString);
		dataTypeMenuList = (List<TDmdataTypeMenu>)query.list();
		return dataTypeMenuList;
	}

	@Override
	public void save(TDmdataTypeMenu dataTypeMenu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TDmdataTypeMenu dataTypeMenu) {
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
