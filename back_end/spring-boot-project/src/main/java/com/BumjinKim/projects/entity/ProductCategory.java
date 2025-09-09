package com.BumjinKim.projects.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity
// Database name -> required to revise
@Table(name = "product_category")
// @Data -- known bug (error on getter/setter)
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // identified name -> required to revise
    @Column(name = "categoryName")
    private String categoryName;

    // 제품은 컬렉션이므로 One to many로 처리
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;
}





