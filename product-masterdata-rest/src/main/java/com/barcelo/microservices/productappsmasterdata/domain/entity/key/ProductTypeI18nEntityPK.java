package com.barcelo.microservices.productappsmasterdata.domain.entity.key;

import com.barcelo.masterdata.language.domain.entity.LanguageEntity;
import com.barcelo.masterdata.language.domain.entity.support.JpaI18nEntityPK;
import com.barcelo.microservices.productappsmasterdata.domain.entity.ProductTypeEntity;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * The type Product type i 18 n entity pk.
 */
@Embeddable
public class ProductTypeI18nEntityPK extends JpaI18nEntityPK {
    private static final long serialVersionUID = 5525800208381427494L;

    @ManyToOne
    @JoinColumn(name = "product_type_code")
    private ProductTypeEntity productType;

    private ProductTypeI18nEntityPK() {
        //empty constructor, hibernate instance
    }

    /**
     * Instantiates a new Product type i 18 n entity pk.
     *
     * @param language    the language
     * @param productType the product type
     */
    public ProductTypeI18nEntityPK(LanguageEntity language, ProductTypeEntity productType) {
        super(language);
        this.productType = productType;
    }

    /**
     * Gets product type.
     *
     * @return the product type
     */
    public ProductTypeEntity getProductType() {
        return productType;
    }
}
