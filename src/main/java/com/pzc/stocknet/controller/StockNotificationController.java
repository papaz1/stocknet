package com.pzc.stocknet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pzc.stocknet.datamodel.StockNotification;
import com.pzc.stocknet.service.StockNotificationService;

@RestController
public class StockNotificationController {

	private StockNotificationService stockNotificationService;
	
	@Autowired
	public void setStockNotificationService(StockNotificationService stockNotificationService) {
		this.stockNotificationService = stockNotificationService;
	}
	
	@GetMapping("/getStockNotifications")
	public List<StockNotification> getStockNotifications(){
		return (List<StockNotification>) stockNotificationService.getAllStockNotifications();
	}
	
	@PostMapping("/postStockNotification")
	public void postStockNotification() {
		stockNotificationService.saveStockNotification();
	}
		
}
