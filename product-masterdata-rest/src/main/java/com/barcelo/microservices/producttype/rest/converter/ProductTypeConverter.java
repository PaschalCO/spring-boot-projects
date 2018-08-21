package com.barcelo.microservices.producttype.rest.converter;

import com.barcelo.microservices.product.masterdata.rest.model.ProductType;
import com.barcelo.microservices.producttype.domain.entity.ProductTypeEntity;

/**
 * The type Product type converter.
 */
public class ProductTypeConverter {

    /**
     * Convert to product type.
     *
     * @param entity the entity
     * @return the product type
     */
    public static ProductType convertTo(ProductTypeEntity entity) {
        ProductType productType;
        if (entity == null) {
            return null;
        }
        productType = new ProductType(entity.getCode());
        productType.setActive(entity.isActive());
        return productType;
    }

    /**
     * Convert to entity product type entity.
     *
     * @param value the value
     * @return the product type entity
     */
    public static ProductTypeEntity convertToEntity(ProductType value) {
        if (value == null) {
            return null;
        }
        return new ProductTypeEntity(value.getCode());
    }
}
