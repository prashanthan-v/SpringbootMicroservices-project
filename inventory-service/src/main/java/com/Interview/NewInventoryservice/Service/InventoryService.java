package com.Interview.NewInventoryservice.Service;

import com.Interview.NewInventoryservice.Repository.InventoryRepository;
import com.Interview.NewInventoryservice.model.Inventory;
import com.Interview.NewInventoryservice.model.InventoryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryService {
    @Autowired
    public InventoryRepository inventoryRepository;
//    @Transactional(readOnly = true)
    public List<InventoryResponse> IsinStock(List<String> names) {
        List<Inventory>inventoryList= inventoryRepository.findByNameIn(names);
       return inventoryList.stream().map(inventory -> InventoryResponse.builder()
                        .name(inventory.getName())
                        .ispresent(inventory.getQuantity()>0)
                        .build()
                       ).toList();

    }
}
