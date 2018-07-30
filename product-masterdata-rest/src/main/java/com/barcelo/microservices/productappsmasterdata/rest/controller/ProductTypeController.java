package com.barcelo.microservices.productappsmasterdata.rest.controller;


import com.barcelo.microservices.product.masterdata.rest.constants.ModelConstants;
import com.barcelo.microservices.product.masterdata.rest.model.ProductType;
import com.barcelo.microservices.productappsmasterdata.domain.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Product type controller.
 */
@RestController
@RequestMapping(ModelConstants.PRODUCTTYPE_REST_URI)
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    /**
     * Instantiates a new Product type controller.
     *
     * @param productTypeService the product type service
     */
    public ProductTypeController(ProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    public List<ProductType> getAll() {
        return this.productTypeService.findAll();
    }

    /**
     * Gets by code.
     *
     * @param code the code
     * @return the by code
     */
    public ProductType getByCode(final String code) {
        return this.productTypeService.findByCode(code);
    }

    /**
     * Update.
     *
     * @param productType the product type
     * @throws Exception the exception
     */
    public void update(final ProductType productType) throws Exception {
        this.productTypeService.update(productType);
    }

    /**
     * Create.
     *
     * @param productType the product type
     * @throws Exception the exception
     */
    public void create(final ProductType productType) throws Exception {
        this.productTypeService.save(productType);
    }

    /**
     * Delete.
     *
     * @param productType the product type
     * @throws Exception the exception
     */
    public void delete(final ProductType productType) throws Exception {
        this.productTypeService.delete(productType);
    }
}
