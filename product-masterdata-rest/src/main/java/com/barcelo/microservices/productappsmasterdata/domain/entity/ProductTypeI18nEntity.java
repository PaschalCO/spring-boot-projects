package com.barcelo.microservices.productappsmasterdata.domain.entity;

import com.barcelo.masterdata.language.domain.entity.support.JpaI18nEntity;
import com.barcelo.microservices.productappsmasterdata.domain.entity.key.ProductTypeI18nEntityPK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The type Product type i 18 n entity.
 */
@Entity
@Table(name = "product_type_i18n")
public class ProductTypeI18nEntity extends JpaI18nEntity {
    private static final long serialVersionUID = -8561455796586799632L;

    @EmbeddedId
    private ProductTypeI18nEntityPK id;


    private ProductTypeI18nEntity() {
        //empty constructor, hibernate instance
    }

    /**
     * Instantiates a new Product type i 18 n entity.
     *
     * @param id          the id
     * @param description the description
     */
    public ProductTypeI18nEntity(ProductTypeI18nEntityPK id, String description) {
        super(description);
        this.id = id;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public ProductTypeI18nEntityPK getId() {
        return id;
    }
}
