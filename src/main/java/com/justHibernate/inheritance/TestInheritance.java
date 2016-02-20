package com.justHibernate.inheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.justHibernate.MySessionFactory;

public class TestInheritance {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("John");
		Employee e = new Employee();
		e.setName("Tom");
		e.setDesignation("Manager");
		Session s = MySessionFactory.getSessionFactory().getCurrentSession();
		Transaction t = s.getTransaction();
		t.begin();
		s.save(p);
		s.save(e);
		t.commit();
	}
}
