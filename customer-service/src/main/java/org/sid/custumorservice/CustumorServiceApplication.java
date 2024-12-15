package org.sid.custumorservice;

import org.sid.custumorservice.config.CustomerConfigParams;
import org.sid.custumorservice.entities.Customer;
import org.sid.custumorservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(CustomerConfigParams.class)
public class CustumorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustumorServiceApplication.class, args);
	}
@Bean
	public CommandLineRunner commandLineRunner(CustomerRepository customerRepository, RepositoryRestConfiguration repositoryRestConfiguration){
		return  args -> {
			repositoryRestConfiguration.exposeIdsFor(Customer.class);
			customerRepository.saveAll(
					List.of(
							Customer.builder().name("Manal").email("m@gmail.com").build(),
							Customer.builder().name("Anas").email("A@gmail.com").build(),
							Customer.builder().name("Zakariae").email("Z@gmail.com").build()
					)
			);
			customerRepository.findAll().forEach(System.out::println);
		} ;
}
}
