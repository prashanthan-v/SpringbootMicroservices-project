package com.Interview.NewOrderservice1.Controller;

import com.Interview.NewOrderservice1.Service.OrderService;
import com.Interview.NewOrderservice1.model.AboutItems;
import com.Interview.NewOrderservice1.model.Order;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("create")
    @CircuitBreaker(name = "inventory",fallbackMethod = "fallbackMethod")
    public String placeOrder(@RequestBody List<AboutItems> aboutItemsList){
        return orderService.placeOrder(aboutItemsList);
    }

    public  String fallbackMethod(List<AboutItems> aboutItemsList,
                                  RuntimeException runtimeException){
        return "Sorry something as went wrong Try again after some time";

    }
   @GetMapping("getall")
    public List<Order> getall(){

        return orderService.getall();
    }

    @DeleteMapping
    public String deleteOrder(){
        return orderService.deleteOrder();
    }
}
