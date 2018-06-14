package com.barcelo.microservices.productappsmasterdata.domain.repository;

import com.barcelo.microservices.productappsmasterdata.domain.entity.ProductTypeI18nEntity;
import com.barcelo.microservices.productappsmasterdata.domain.entity.key.ProductTypeI18nEntityPK;
import com.barcelo.microservices.utilities.repository.RepositoryI18nSupport;

import java.util.List;

/**
 * The interface Product type i 18 n repository.
 */
public interface ProductTypeI18nRepository extends RepositoryI18nSupport<ProductTypeI18nEntity, ProductTypeI18nEntityPK> {

    /**
     * Find by id product type code list.
     *
     * @param code the code
     * @return the list
     */
    public List<ProductTypeI18nEntity> findByIdProductTypeCode(String code);

    /**
     * Find by id product type code and id language code product type i 18 n entity.
     *
     * @param code         the code
     * @param languageCode the language code
     * @return the product type i 18 n entity
     */
    public ProductTypeI18nEntity findByIdProductTypeCodeAndIdLanguageCode(String code, String languageCode);
}
