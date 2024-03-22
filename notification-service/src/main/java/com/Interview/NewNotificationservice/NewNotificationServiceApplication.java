package com.Interview.NewNotificationservice;

import com.Interview.NewNotificationservice.Service.Orderplacedevent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class NewNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewNotificationServiceApplication.class, args);
	}
  @KafkaListener(topics = "notification",groupId = "user-group1")
	public void handlenotification(Orderplacedevent orderplacedevent){
		log.info("received notification your order {}",orderplacedevent.getOrderno());

  }
}
