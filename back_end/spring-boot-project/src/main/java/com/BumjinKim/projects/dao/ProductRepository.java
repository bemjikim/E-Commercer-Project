package com.BumjinKim.projects.dao;

import com.BumjinKim.projects.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


// JpaRepository<Entity, PrimaryKey>
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Using query-method and match by category id using this parameter value.
    // Spring will execute a query similar to this "SELECT * FROM product where category_id=?"
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    Page<Product> findByNameContaining(@Param("name") String name, Pageable page);

}
