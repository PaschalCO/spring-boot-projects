package com.barcelo.microservices.productappsmasterdata.domain.service;

import com.barcelo.microservices.product.masterdata.rest.model.ProductType;
import com.barcelo.microservices.productappsmasterdata.domain.entity.ProductTypeEntity;
import com.barcelo.microservices.productappsmasterdata.domain.repository.ProductTypeRepository;
import com.barcelo.microservices.productappsmasterdata.rest.converter.ProductTypeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Product type service.
 */
@Service
public class ProductTypeService {

    @Autowired
    private final ProductTypeRepository repository;

    /**
     * Instantiates a new Product type service.
     *
     * @param repository the repository
     */
    public ProductTypeService(ProductTypeRepository repository) {
        this.repository = repository;
    }

    /**
     * Find all list.
     *
     * @return the list
     */
    public List<ProductType> findAll() {
        Iterable<ProductTypeEntity> all = this.repository.findAll();
        List<ProductType> productTypeList = new ArrayList<>();
        for (ProductTypeEntity productTypeEntity : all) {
            productTypeList.add(ProductTypeConverter.convertTo(productTypeEntity));
        }
        return productTypeList;
    }

    /**
     * Find by code product type.
     *
     * @param code the code
     * @return the product type
     */
    public ProductType findByCode(final String code) {
        ProductTypeEntity productTypeEntity = this.repository.findByCode(code);
        return ProductTypeConverter.convertTo(productTypeEntity);
    }

    /**
     * Save.
     *
     * @param productType the product type
     * @throws Exception the exception
     */
    public void save(final ProductType productType) throws Exception {
        if (productType == null) {
            throw new Exception("Entity is null");
        }
        ProductTypeEntity productTypeEntity = ProductTypeConverter.convertToEntity(productType);
        this.repository.save(productTypeEntity);
    }

    /**
     * Update.
     *
     * @param productType the product type
     * @throws Exception the exception
     */
    public void update(final ProductType productType) throws Exception {
        if (productType == null) {
            throw new Exception("Entity is null");
        }

        ProductTypeEntity productTypeEntity = this.repository.findByCode(productType.getCode());
        productTypeEntity.setActive(false);

        this.repository.save(productTypeEntity);
    }

    /**
     * Delete.
     *
     * @param productType the product type
     * @throws Exception the exception
     */
    public void delete(final ProductType productType) throws Exception {
        if (productType == null) {
            throw new Exception("Entity id null");
        }

        ProductTypeEntity productTypeEntity = this.repository.findByCode(productType.getCode());

        productTypeEntity.setActive(false);

        this.repository.save(productTypeEntity);
    }

}
