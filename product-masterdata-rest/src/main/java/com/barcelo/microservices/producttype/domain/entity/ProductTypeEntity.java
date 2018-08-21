package com.barcelo.microservices.producttype.domain.entity;


import com.barcelo.masterdata.language.domain.entity.support.JpaEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The type Product type entity.
 */
@Entity
@Table(name = "product_type")
public class ProductTypeEntity extends JpaEntity {
    private static final long serialVersionUID = -3151619491211661334L;

    private ProductTypeEntity() {
        //empty constructor, hibernate instance
    }

    /**
     * Instantiates a new Product type entity.
     *
     * @param code the code
     */
    public ProductTypeEntity(String code) {
        super(code);
    }
}
