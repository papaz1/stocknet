package com.pzc.stocknet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.pzc.stocknet.datamodel.StockNotification;
import com.pzc.stocknet.db.StocknetDb;
import com.pzc.stocknet.repository.ResourceRepository;

@SpringBootApplication
public class StocknetApplication {
	
	private static final Logger log = LoggerFactory.getLogger(StocknetApplication.class);
	
	public static void main(String[] args) {
		//StocknetDb.createDatabase();
		SpringApplication.run(StocknetApplication.class, args);
	}
	
    @Bean
    public CommandLineRunner demo(ResourceRepository resourceRepository) {
        return (args) -> {
            resourceRepository.save(new StockNotification());
            log.info("Database contents");
            for (StockNotification stockNotification : resourceRepository.findAll()) {
                log.info("Here are the values from the database: " + String.valueOf(stockNotification.getId()));
            }
        };
    }
}
