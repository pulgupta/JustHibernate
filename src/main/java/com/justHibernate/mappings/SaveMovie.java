package com.justHibernate.mappings;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.justHibernate.MySessionFactory;

public class SaveMovie {
	/**
	 * One to one mapping
	 */
	public static void main(String[] args) {
		
		PhoneNumber pn = new PhoneNumber("+91", 9897,632694);
		LeadActor la = new LeadActor();
		la.setName("Akshay Kumar");
		la.setAge(40);
		la.setPn(pn);
		
		Producers p1 = new Producers();
		p1.setAmount(100L);
		p1.setName("prod1");
		
		Producers p2 = new Producers();
		p2.setAmount(100L);
		p2.setName("prod1");
		
		Financers f1 = new Financers();
		f1.setName("f1");
		f1.setInvestment(100L);
		
		Financers f2 = new Financers();
		f2.setName("f2");
		f2.setInvestment(100L);
		
		List<Producers> plist = new ArrayList<Producers>();
		plist.add(p1);
		plist.add(p2);
		
		List<Financers> flist = new ArrayList<Financers>();
		flist.add(f1);
		flist.add(f2);
		
		f1.setPd(plist);
		p1.setFin(flist);
		p2.setFin(flist);
		
		Movie mv = new Movie();
		mv.setName("Airlift");
		mv.setReleaseYear("2015");
		mv.setLa(la);
		mv.setProducers(plist);
		
		Session s = MySessionFactory.getSessionFactory().getCurrentSession();
		Transaction tx = s.getTransaction();
		tx.begin();
		s.save(mv);
		tx.commit();
	}
}
