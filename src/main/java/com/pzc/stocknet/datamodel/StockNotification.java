package com.pzc.stocknet.datamodel;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Table(indexes = { @Index(name = "stockName", columnList = "stockName", unique = true) })
@Entity
public class StockNotification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	private String stockName;

	private Date transcationDate;

	private Date publishDate;

	private double price;

	private Currency currency;

	private ActivityTypeEnum activityType;

	private ActivityEnum activity;

	private int volume;

	public StockNotification() {

	}

	public StockNotification(String stockName) {
		this.stockName = stockName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Date getTranscationDate() {
		return transcationDate;
	}

	public void setTranscationDate(Date transcationDate) {
		this.transcationDate = transcationDate;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public ActivityTypeEnum getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityTypeEnum activityType) {
		this.activityType = activityType;
	}

	public ActivityEnum getActivity() {
		return activity;
	}

	public void setActivity(ActivityEnum activity) {
		this.activity = activity;
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
