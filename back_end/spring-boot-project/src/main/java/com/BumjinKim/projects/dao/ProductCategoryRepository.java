package com.BumjinKim.projects.dao;


import com.BumjinKim.projects.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

// collectionResourceRel: Name of JSON entry, path: /product-category (경로 참조)
// JpaRepository<Entity, PrimaryKey>
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
