package com.justHibernate.mappings;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Financers {
	
	@Id
	@GeneratedValue
	@Column(name="fin_id")
	int id;
	
	String name;
	Long investment;
	
	/**
	 * This mappedBy is necessary to tell hibernate to look into financers
	 * for the mapping table details.
	 */
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "financers")
	List<Producers> pd;
	
	
	public List<Producers> getPd() {
		return pd;
	}
	public void setPd(List<Producers> pd) {
		this.pd = pd;
	}
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
	public Long getInvestment() {
		return investment;
	}
	public void setInvestment(Long investment) {
		this.investment = investment;
	}
	
}
