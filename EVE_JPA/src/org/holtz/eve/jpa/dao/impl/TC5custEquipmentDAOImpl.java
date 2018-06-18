package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TC5custEquipmentDAO;
import org.holtz.eve.jpa.entity.TC5custEquipment;
import org.holtz.jpa.util.HibernateUtil;

public class TC5custEquipmentDAOImpl implements TC5custEquipmentDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TC5custEquipmentDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TC5custEquipment getcustEquipmentById(int id) {
		String queryString = "from TC5custEquipment custequip where custequip.id = :id";
		TC5custEquipment custEquip = new TC5custEquipment();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		custEquip = (TC5custEquipment) query.uniqueResult();
		return custEquip;
	}

	@Override
	public TC5custEquipment getcustEquipmentByName(String name) {
		//NOOP
		return null;
		
//		String queryString = "from TC5custEquipment custequip where custequip.id like CONCAT('%',:name,'%')";
//		TC5custEquipment custEquip = new TC5custEquipment();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		custEquip = (TC5custEquipment) query.uniqueResult();
//		return custEquip;
	}

	@Override
	public List<TC5custEquipment> getcustEquipmentList() {
		String queryString = "from TC5custEquipment";
		List<TC5custEquipment> custEquipList = new ArrayList<TC5custEquipment>();
		query = session.createQuery(queryString);
		custEquipList = (List<TC5custEquipment>)query.list();
		return custEquipList;
	}

	@Override
	public void save(TC5custEquipment account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TC5custEquipment account) {
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
