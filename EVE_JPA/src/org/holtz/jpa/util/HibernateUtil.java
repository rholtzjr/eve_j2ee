package org.holtz.jpa.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil
{
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    static
    {
        try
        {
//          Configuration configuration = new Configuration();
            Configuration configuration = new Configuration().configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        catch (HibernateException he)
        {
            System.err.println("Error creating Session: " + he);
            throw new ExceptionInInitializerError(he);
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    } 
}
//public class HibernateUtil
//{
//	private static SessionFactory sessionFactory = createSessionFactory();
//
//	private static SessionFactory createSessionFactory() {
//		if (sessionFactory == null) {
//			 Configuration configuration = new Configuration();
//	            configuration.configure("hibernate.cfg.xml");
//
//	            ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
//	            SessionFactory sessionFactory = configuration.buildSessionFactory(sr);
////			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
////			Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
////			sessionFactory = metaData.getSessionFactoryBuilder().build();
//		}
//		return sessionFactory;
//	}
//
//	public static SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
//
//	public static void shutdown() {
//		sessionFactory.getCurrentSession().close();
//	}
//}