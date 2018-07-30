package com.barcelo.microservices.product.masterdata.rest.model;

import com.barcelo.microservices.support.api.model.ApiDto;

/**
 * The type Product type.
 */
public class ProductType extends ApiDto {

    private ProductType() {
        //empty constructor, hibernate instance
    }

    /**
     * Instantiates a new Product type.
     *
     * @param code the code
     */
    public ProductType(String code) {
        super(code);
    }
}
