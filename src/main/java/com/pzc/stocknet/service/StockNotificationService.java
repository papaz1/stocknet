package com.pzc.stocknet.service;

import java.util.Optional;

import com.pzc.stocknet.datamodel.StockNotification;

public interface StockNotificationService {
	Optional<StockNotification> getStockNotification(Integer id);
	Iterable<StockNotification> getAllStockNotifications();
	void saveStockNotification(StockNotification stockNotification);
}
