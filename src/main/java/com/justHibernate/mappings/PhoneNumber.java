package com.justHibernate.mappings;

public class PhoneNumber {
		
	String countryCode;
	int areaCode;
	int number;
	public PhoneNumber(){}
	
	public PhoneNumber(String countryCode, int areaCode, int number) {
		super();
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.number = number;
	}
	
}
