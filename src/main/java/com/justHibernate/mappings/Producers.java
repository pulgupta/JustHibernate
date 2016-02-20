package com.justHibernate.mappings;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Producers {
	
	@Id
	@Column(name="producer_id")
	@GeneratedValue
	int id;
	String name;
	Long amount;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="prod_fin_link")
	List<Financers> financers;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public List<Financers> getFinancers() {
		return financers;
	}
	public void setFin(List<Financers> financers) {
		this.financers = financers;
	}
	
}
