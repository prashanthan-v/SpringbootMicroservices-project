package com.Interview.NewInventoryservice.Repository;


import com.Interview.NewInventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory,Integer> {


    List<Inventory>findByNameIn(List<String> names);
}
