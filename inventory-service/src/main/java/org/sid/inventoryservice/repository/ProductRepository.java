package org.sid.inventoryservice.repository;

import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.sid.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long > {
}
