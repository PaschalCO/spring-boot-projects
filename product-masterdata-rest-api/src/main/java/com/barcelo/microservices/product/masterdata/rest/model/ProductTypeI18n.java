package com.barcelo.microservices.product.masterdata.rest.model;

import com.barcelo.microservices.support.api.model.ApiDtoI18n;
import com.barcelo.microservices.support.api.model.language.Language;

/**
 * The type Product type i 18 n.
 */
public class ProductTypeI18n extends ApiDtoI18n {

    private ProductTypeI18n() {
        //empty constructor, hibernate instance
    }

    /**
     * Instantiates a new Product type i 18 n.
     *
     * @param language    the language
     * @param productType the product type
     * @param description the description
     */
    public ProductTypeI18n(Language language, ProductType productType, String description) {
        super(language, productType, description);
    }


}
