package com.justHibernate.mappings;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class LeadActor {
	
	@Id
	@Column(name="actor_id")
	@GeneratedValue
	int id;
	String Name;
	int age;
	@Embedded
	PhoneNumber pn;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PhoneNumber getPn() {
		return pn;
	}
	public void setPn(PhoneNumber pn) {
		this.pn = pn;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
