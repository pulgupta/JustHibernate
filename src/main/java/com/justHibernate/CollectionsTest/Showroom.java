package com.justHibernate.CollectionsTest;

import java.util.List;

public class Showroom {
	
	private int id;
	private String manager;
	private String address;
	private List<Car> listAvai;

	public Showroom(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Car> getListAvai() {
		return listAvai;
	}

	public void setListAvai(List<Car> listAvai) {
		this.listAvai = listAvai;
	}
	
}
