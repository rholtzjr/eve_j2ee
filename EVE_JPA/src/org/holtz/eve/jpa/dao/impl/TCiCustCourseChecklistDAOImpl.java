package org.holtz.eve.jpa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.holtz.eve.jpa.dao.TCiCustCourseChecklistDAO;
import org.holtz.eve.jpa.entity.TAcAccount;
import org.holtz.eve.jpa.entity.TCiCustCourseChecklist;
import org.holtz.jpa.util.HibernateUtil;

public class TCiCustCourseChecklistDAOImpl implements TCiCustCourseChecklistDAO {

	private SessionFactory sessionFactory;
	private Session session;
	private Query query;
	
	public TCiCustCourseChecklistDAOImpl() {
		getSessionFactory();
		setSession(sessionFactory.openSession());
	}

	@Override
	public TCiCustCourseChecklist getCourseCheckListById(int id) {
		String queryString = "from TCiCustCourseChecklist checklist where checklist.id = :id";
		TCiCustCourseChecklist checklist = new TCiCustCourseChecklist();
		query = session.createQuery(queryString);
		query.setInteger("id", id);
		checklist = (TCiCustCourseChecklist) query.uniqueResult();
		return checklist;
	}

	@Override
	public TCiCustCourseChecklist getCourseCheckListByName(String name) {
		String queryString = "from TCiCustCourseChecklist checklist where checklist.TC1custCourse.TCsCourse.csCourseNoTx like CONCAT('%',:name,'%')";
		TCiCustCourseChecklist checklist = new TCiCustCourseChecklist();
		query = session.createQuery(queryString);
		query.setString("name", name);
		checklist = (TCiCustCourseChecklist) query.uniqueResult();
		return checklist;
	}

	@Override
	public List<TCiCustCourseChecklist> getCourseCheckListList() {
		String queryString = "from TCiCustCourseChecklist";
		List<TCiCustCourseChecklist> checklistList = new ArrayList<TCiCustCourseChecklist>();
		query = session.createQuery(queryString);
		checklistList = (List<TCiCustCourseChecklist>)query.list();
		return checklistList;
	}

	@Override
	public void save(TCiCustCourseChecklist checkList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(TCiCustCourseChecklist checkList) {
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
