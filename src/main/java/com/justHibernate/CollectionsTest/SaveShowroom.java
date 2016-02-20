package com.justHibernate.CollectionsTest;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.justHibernate.MySessionFactory;

public class SaveShowroom {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setModelName("Duster");
		c1.setYear("2106");
		
		Car c2 = new Car();
		c2.setModelName("HondaCity");
		c2.setYear("2015");
		
		List<Car> carDetails = new ArrayList<Car>();
		carDetails.add(c1);
		carDetails.add(c2);
		
		Showroom sr = new Showroom();
		sr.setManager("Tom");
		sr.setAddress("Pune");
		sr.setListAvai(carDetails);
		Session session = MySessionFactory.getSessionFactory().getCurrentSession();
        Transaction trx = session.getTransaction();
        trx.begin();
        session.save(sr);
        trx.commit();
	}
}
