package com.barcelo.microservices.product.masterdata.rest.api;

import com.barcelo.microservices.product.masterdata.rest.model.ProductType;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * The interface Product type api.
 */
public interface ProductTypeApi {

    /**
     * Gets all.
     *
     * @return the all
     */
    @RequestLine("GET")
    List<ProductType> getAll();

    /**
     * Gets by code.
     *
     * @param code the code
     * @return the by code
     */
    @RequestLine("GET /{code}")
    ProductType getByCode(@Param("code") String code);

    /**
     * Update.
     *
     * @param productType the product type
     */
    @RequestLine("PUT")
    @Headers("Content-Type: application/json")
    void update(ProductType productType);

    /**
     * Create.
     *
     * @param productType the product type
     */
    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    void create(ProductType productType);

    /**
     * Delete.
     *
     * @param code the code
     */
    @RequestLine("DELETE /{code}")
    void delete(String code);
}
