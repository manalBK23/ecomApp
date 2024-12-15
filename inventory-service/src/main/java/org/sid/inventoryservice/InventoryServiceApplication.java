package org.sid.inventoryservice;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
@Bean
	CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration repositoryRestConfiguration){
		return args -> {
			repositoryRestConfiguration.exposeIdsFor(Product.class);
			productRepository.saveAll(
			List.of(
					Product.builder().name("Computer").quality(12).price(1200).build(),
					Product.builder().name("Printer").quality(32).price(120).build(),
					Product.builder().name("Smartphone").quality(31).price(900).build()
			)
			);
		};
}
}
