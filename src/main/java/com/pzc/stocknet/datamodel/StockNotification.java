package com.pzc.stocknet.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StockNotification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String stockName;
	
	public StockNotification() {
		
	}
	public StockNotification(String stockName) {
		this.stockName = stockName;
	}
	
	public Integer getId() {
		return id;
	}

	public String getStockName() {
		return stockName;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
}
