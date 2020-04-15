package com.pzc.stocknet.repository;

import org.springframework.data.repository.CrudRepository;
import com.pzc.stocknet.datamodel.StockNotification;

public interface ResourceRepository extends CrudRepository<StockNotification, Integer> {
}
