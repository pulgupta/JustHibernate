package com.justHibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MySessionFactory {
	
	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration().configure("com/resources/hibernate.cfg.xml")
				.addAnnotatedClass(Trade.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		return config.buildSessionFactory(registry);
	}
}
