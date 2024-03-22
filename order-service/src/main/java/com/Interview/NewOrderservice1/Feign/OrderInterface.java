package com.Interview.NewOrderservice1.Feign;


import com.Interview.NewOrderservice1.model.InventoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//@Component
@FeignClient("INVENTORY-SERVICE")
public interface OrderInterface {
    @GetMapping("inventory/get")
     List<InventoryResponse> IsinStock(@RequestParam List<String> name);
}
