package FoodEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FoodEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodEurekaApplication.class, args);
	}

}
