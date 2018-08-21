package com.barcelo.microservices.producttype.configuration;

import com.barcelo.masterdata.language.domain.entity.LanguageEntity;
import com.barcelo.microservices.producttype.domain.entity.ProductTypeI18nEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackageClasses = {LanguageEntity.class, ProductTypeI18nEntity.class})
public class AppConfiguration {
}
