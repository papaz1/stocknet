package com.pzc.stocknet.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pzc.stocknet.datamodel.StockNotification;
import com.pzc.stocknet.repository.ResourceRepository;
import com.pzc.stocknet.service.StockNotificationService;

@Service
public class StockNotificationServiceImpl implements StockNotificationService {
	private ResourceRepository resourceRepository;
	
	@Autowired
	public void setResourceRepository(ResourceRepository resrouceRepository) {
		this.resourceRepository = resrouceRepository;
	}

	@Override
	public Optional<StockNotification> getStockNotification(Integer id) {
		return resourceRepository.findById(id);
	}

	@Override
	public Iterable<StockNotification> getAllStockNotifications() {
		return resourceRepository.findAll();
	}

	@Override
	public void saveStockNotification(StockNotification stockNotification) {
		resourceRepository.save(stockNotification);
	}
	
}
