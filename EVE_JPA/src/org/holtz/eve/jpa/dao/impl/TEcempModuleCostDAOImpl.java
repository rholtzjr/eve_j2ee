package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEcempModuleCostDAO;
import org.holtz.eve.jpa.entity.TEcempModuleCost;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TEcempModuleCost;

public class TEcempModuleCostDAOImpl implements TEcempModuleCostDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEcempModuleCostDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEcempModuleCost getEmpModuleCostById(int id) {
		String queryString = "from TEcempModuleCost empModuleCost where empModuleCost.ecempModuleCostId = :id";
		TEcempModuleCost empModuleCost = new TEcempModuleCost();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		empModuleCost = (TEcempModuleCost) query.uniqueResult();
		return empModuleCost;
	}

	@Override
	public TEcempModuleCost getEmpModuleCostByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TEcempModuleCost empModuleCost where empModuleCost. like CONCAT('%',:name,'%')";
//		TEcempModuleCost empModuleCost = new TEcempModuleCost();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		empModuleCost = (TEcempModuleCost) query.uniqueResult();
//		return empModuleCost;
	}

	@Override
	public List<TEcempModuleCost> getEmpModuleCostList() {
		String queryString = "from TEcempModuleCost";
		List<TEcempModuleCost> empModuleCostList = new ArrayList<TEcempModuleCost>();
		query = session.createQuery(queryString);
		empModuleCostList = (List<TEcempModuleCost>)query.list();
		return empModuleCostList;
	}

	@Override
	public void save(TEcempModuleCost empModuleCost) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEcempModuleCost empModuleCost) {
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
