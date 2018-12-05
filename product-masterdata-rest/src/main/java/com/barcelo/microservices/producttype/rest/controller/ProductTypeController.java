package com.barcelo.microservices.producttype.rest.controller;


import com.barcelo.microservices.product.masterdata.rest.constants.ModelConstants;
import com.barcelo.microservices.product.masterdata.rest.model.ProductType;
import com.barcelo.microservices.producttype.domain.service.ProductTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Product type controller.
 */
@RestController
@RequestMapping(value = ModelConstants.PRODUCTTYPE_REST_URI)
@Api(value = "Product Type",
        description = "Product Type Application",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductTypeController {

    private ProductTypeService productTypeService;

    /**
     * Instantiates a new Product type controller.
     *
     * @param productTypeService the product type service
     */
    @Autowired
    public ProductTypeController(ProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Get all Product Types")
    public List<ProductType> getAll() {
        return this.productTypeService.findAll();
    }

    /**
     * Gets by code.
     *
     * @param code the code
     * @return the by code
     */
    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    @ApiOperation(value = "Get Product Type by code", response = ProductType.class)
    public ProductType getByCode(final @PathVariable String code) {
        return this.productTypeService.findByCode(code);
    }

    /**
     * Update.
     *
     * @param productType the product type
     * @throws Exception the exception
     */
    @RequestMapping(method = RequestMethod.PUT)
    @ApiOperation(value = "Update a Product Type")
    public void update(@RequestBody final ProductType productType) throws Exception {
        this.productTypeService.update(productType);
    }

    /**
     * Create.
     *
     * @param productType the product type
     * @throws Exception the exception
     */
    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Create a new Product Type")
    public void create(@RequestBody final ProductType productType) throws Exception {
        this.productTypeService.save(productType);
    }

    /**
     * Delete.
     *
     * @param code the code
     * @throws Exception the exception
     */
    @RequestMapping(value = "/{code}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Delete a Product Type")
    public void delete(final @PathVariable String code) throws Exception {
        this.productTypeService.delete(code);
    }
}

//Return Http response bodies instead of void
//Path should be constants
//ExceptionHandling