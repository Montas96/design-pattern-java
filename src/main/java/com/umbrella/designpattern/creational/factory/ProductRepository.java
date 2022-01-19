package com.umbrella.designpattern.creational.factory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface ProductRepository extends MongoRepository<AbstractProduct, String> {
}
