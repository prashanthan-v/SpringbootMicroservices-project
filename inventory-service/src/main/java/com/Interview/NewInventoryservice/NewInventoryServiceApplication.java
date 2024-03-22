package com.Interview.NewInventoryservice;

import com.Interview.NewInventoryservice.Repository.InventoryRepository;
import com.Interview.NewInventoryservice.model.Inventory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableDiscoveryClient
public class NewInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewInventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory1 = new Inventory();
			inventory1.setName("Oreo");
			inventory1.setQuantity(100);
			Inventory inventory2 = new Inventory();
			inventory2.setName("Detol");
			inventory2.setQuantity(10);
			Inventory inventory3 = new Inventory();
			inventory3.setName("closeup");
			inventory3.setQuantity(50);


			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);   
			inventoryRepository.save(inventory3);

		};
	}

}
