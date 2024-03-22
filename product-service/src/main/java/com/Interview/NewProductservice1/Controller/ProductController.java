package com.Interview.NewProductservice1.Controller;


import com.Interview.NewProductservice1.Service.ProductService;
import com.Interview.NewProductservice1.model.Product;
import com.Interview.NewProductservice1.model.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("create")
    public String createproduct (@RequestBody Product product){
        return productService.createproduct(product);
    }
    @GetMapping
    public List<ProductResponse> getall(){
        return productService.getall();
    }

}
