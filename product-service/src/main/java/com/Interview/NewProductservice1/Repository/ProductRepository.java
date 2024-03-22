package com.Interview.NewProductservice1.Repository;


import com.Interview.NewProductservice1.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {


}
