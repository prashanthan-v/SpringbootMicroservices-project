package com.Interview.NewInventoryservice.Controller;


import com.Interview.NewInventoryservice.Service.InventoryService;
import com.Interview.NewInventoryservice.model.InventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("inventory")
public class  InventoryController {
    @Autowired
    private InventoryService inventoryService;

   @GetMapping("get")
    public  List<InventoryResponse> IsinStock(@RequestParam List<String> name){
        return inventoryService.IsinStock(name);
    }
}
