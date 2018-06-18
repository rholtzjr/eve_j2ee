package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TPnPcprinterDAO;
import org.holtz.eve.jpa.entity.TPnPcprinter;
import org.holtz.jpa.util.HibernateUtil;

public class TPnPcprinterDAOImpl implements TPnPcprinterDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TPnPcprinterDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TPnPcprinter getPcprinterById(int id) {
		String queryString = "from TPnPcprinter pcprinter where pcprinter.pnPcprinterId = :id";
		TPnPcprinter pcprinter = new TPnPcprinter();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		pcprinter = (TPnPcprinter) query.uniqueResult();
		return pcprinter;
	}

	@Override
	public TPnPcprinter getPcprinterByName(String name) {
		String queryString = "from TPnPcprinter pcprinter where pcprinter.pnPcprinterId like CONCAT('%',:name,'%')";
		TPnPcprinter pcprinter = new TPnPcprinter();
		query = session.createQuery(queryString);
		query.setString("name", name);
		pcprinter = (TPnPcprinter) query.uniqueResult();
		return pcprinter;
	}

	@Override
	public List<TPnPcprinter> getPcprinterList() {
		String queryString = "from TPnPcprinter";
		List<TPnPcprinter> pcprinterList = new ArrayList<TPnPcprinter>();
		query = session.createQuery(queryString);
		pcprinterList = (List<TPnPcprinter>)query.list();
		return pcprinterList;
	}

	@Override
	public void save(TPnPcprinter pcprinter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TPnPcprinter pcprinter) {
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
