package com.Interview.NewOrderservice1.Repository;


import com.Interview.NewOrderservice1.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

}
