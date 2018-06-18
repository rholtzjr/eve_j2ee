package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEqEquipmentDAO;
import org.holtz.eve.jpa.entity.TEqEquipment;
import org.holtz.jpa.util.HibernateUtil;

public class TEqEquipmentDAOImpl implements TEqEquipmentDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEqEquipmentDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEqEquipment getEquipmentById(int id) {
		String queryString = "from TEqEquipment equipment where equipment.eqEquipmentId = :id";
		TEqEquipment equipment = new TEqEquipment();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		equipment = (TEqEquipment) query.uniqueResult();
		return equipment;
	}

	@Override
	public TEqEquipment getEquipmentByName(String name) {
		String queryString = "from TEqEquipment equipment where equipment.eqDescriptionTxN like CONCAT('%',:name,'%')";
		TEqEquipment equipment = new TEqEquipment();
		query = session.createQuery(queryString);
		query.setString("name", name);
		equipment = (TEqEquipment) query.uniqueResult();
		return equipment;
	}

	@Override
	public List<TEqEquipment> getEquipmentList() {
		String queryString = "from TEqEquipment";
		List<TEqEquipment> equipmentList = new ArrayList<TEqEquipment>();
		query = session.createQuery(queryString);
		equipmentList = (List<TEqEquipment>)query.list();
		return equipmentList;
	}

	@Override
	public void save(TEqEquipment equipment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEqEquipment equipment) {
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
