package com.justHibernate.mappings;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Movie {
	
	@Id
	@Column(name="movie_id")
	@GeneratedValue
	int id;
	String name;
	String releaseYear;
	
	@OneToOne(cascade = CascadeType.ALL)
	LeadActor la;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="movie_producer_id")
	List<Producers> producers;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public LeadActor getLa() {
		return la;
	}
	public void setLa(LeadActor la) {
		this.la = la;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Producers> getProducers() {
		return producers;
	}
	public void setProducers(List<Producers> producers) {
		this.producers = producers;
	}
	
	
}
