package com.justHibernate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TRADES")
public class Trade implements Serializable {

	/**
	 * The version id for this serializable class
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	
	@Id
	private long tradeId = -1;
	private double quantity = 0;
	private String security = null;
	
	public long getTradeId() {
		return tradeId;
	}
	public void setTradeId(long tradeId) {
		this.tradeId = tradeId;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
}
