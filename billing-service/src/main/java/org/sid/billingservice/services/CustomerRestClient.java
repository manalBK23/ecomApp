package org.sid.billingservice.services;

import org.sid.billingservice.model.Customer;
import org.sid.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {
    @GetMapping(path="/api/customers/{id}")
    Customer findCustomerById(@PathVariable Long id);
    @GetMapping(path = "/api/customers")
    PagedModel<Customer> allCustomers();
}
