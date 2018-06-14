package com.barcelo.microservices.productappsmasterdata.domain.service;

import com.barcelo.microservices.productappsmasterdata.domain.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {

    @Autowired
    private ProductTypeRepository repository;

    public ProductTypeService(){

    }
}
