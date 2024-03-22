package com.Interview.NewOrderservice1.Service;


import com.Interview.NewOrderservice1.Feign.OrderInterface;
import com.Interview.NewOrderservice1.Repository.OrderRepository;
import com.Interview.NewOrderservice1.model.AboutItems;
import com.Interview.NewOrderservice1.model.InventoryResponse;
import com.Interview.NewOrderservice1.model.Order;
import com.Interview.NewOrderservice1.model.Orderplacedevent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private OrderInterface orderInterface;
    @Autowired
    private KafkaTemplate<String, Orderplacedevent>kafkaTemplate;

    public List<Order> getall() {
        return repository.findAll();
    }

    public String placeOrder(List<AboutItems> aboutItems) {
        Order order = new Order();
        List<AboutItems>itemsList = new ArrayList<>();
        order.setOrderno(UUID.randomUUID().toString());

   //with itemdetails got from user create a list of name that has to be extracte
        //from each of aboutitems from the list
        List<String> name = aboutItems.stream().map(aboutItems1 -> aboutItems1.getName()).toList();
        List<InventoryResponse> inventoryResponses = orderInterface.IsinStock(name);
        // checking the responses we got that we have the required quantity if yes place
        // the order or throw exception
        for (InventoryResponse response:inventoryResponses){
            if(!response.isIspresent()){
                throw new IllegalArgumentException("Your item"+
                        response.getName()+ "is currently ran out of" +
                        " stock kindly try after some time !! ");
            }
        }
        order.setAboutItemslist(aboutItems);

         repository.save(order);
         kafkaTemplate.send("notification",new Orderplacedevent(order.getOrderno()));

        return "Your Order Placed Successfully!!!";
    }

    public String deleteOrder() {
        repository.deleteAll();
        return "deleted";
    }
}
