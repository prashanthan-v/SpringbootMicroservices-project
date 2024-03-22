package com.Interview.NewProductservice1.Service;

import com.Interview.NewProductservice1.Repository.ProductRepository;
import com.Interview.NewProductservice1.model.Product;
import com.Interview.NewProductservice1.model.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public String createproduct(Product product) {
        return repository.save(product).getDescription();
    }

    public List<ProductResponse> getall() {
        List<Product>productList=  repository.findAll();
        //here Function (interface) used as argument for the map
       return productList.stream().map(product ->getResponse(product)).toList();
       // return productList.stream().map(this::getResponse).toList(); using methodreference
    }

    private ProductResponse getResponse(Product product) {
        return ProductResponse.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
