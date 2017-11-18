package com.askme.app.HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	final static SessionFactory SessionFactory;
	
	static {
		try {
			Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
			SessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory() {
        return SessionFactory;
    }
}
