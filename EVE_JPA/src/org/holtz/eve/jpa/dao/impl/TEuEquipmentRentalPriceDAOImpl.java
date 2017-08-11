package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TEuEquipmentRentalPriceDAO;
import org.holtz.eve.jpa.entity.TEuEquipmentRentalPrice;
import org.holtz.jpa.util.HibernateUtil;
import org.holtz.eve.jpa.entity.TEuEquipmentRentalPrice;

public class TEuEquipmentRentalPriceDAOImpl implements TEuEquipmentRentalPriceDAO {

	
	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TEuEquipmentRentalPriceDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TEuEquipmentRentalPrice getEquipmentRentalPriceById(int id) {
		String queryString = "from TEuEquipmentRentalPrice equipmentRentalPrice where equipmentRentalPrice.euEquipRentalPriceId = :id";
		TEuEquipmentRentalPrice equipmentRentalPrice = new TEuEquipmentRentalPrice();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		equipmentRentalPrice = (TEuEquipmentRentalPrice) query.uniqueResult();
		return equipmentRentalPrice;
	}

	@Override
	public TEuEquipmentRentalPrice getEquipmentRentalPriceByName(String name) {
		//NOOP
		return null;
//		String queryString = "from TEuEquipmentRentalPrice equipmentRentalPrice where equipmentRentalPrice.euEquipRentalPriceId like CONCAT('%',:name,'%')";
//		TEuEquipmentRentalPrice equipmentRentalPrice = new TEuEquipmentRentalPrice();
//		query = session.createQuery(queryString);
//		query.setString("name", name);
//		equipmentRentalPrice = (TEuEquipmentRentalPrice) query.uniqueResult();
//		return equipmentRentalPrice;
	}

	@Override
	public List<TEuEquipmentRentalPrice> getEquipmentRentalPriceList() {
		String queryString = "from TEuEquipmentRentalPrice";
		List<TEuEquipmentRentalPrice> equipmentRentalPriceList = new ArrayList<TEuEquipmentRentalPrice>();
		query = session.createQuery(queryString);
		equipmentRentalPriceList = (List<TEuEquipmentRentalPrice>)query.list();
		return equipmentRentalPriceList;
	}

	@Override
	public void save(TEuEquipmentRentalPrice equipmentRentalPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TEuEquipmentRentalPrice equipmentRentalPrice) {
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
