# Food Application Microservices

Welcome to the Food Application Microservices project! This project is composed of multiple microservices to handle various functionalities of a food application.

![Architecture of Microservice](https://media.licdn.com/dms/image/D4D22AQHhigbMKdWyUQ/feedshare-shrink_2048_1536/0/1705035871083?e=2147483647&v=beta&t=i7QTom3FqkOteqOWDfynnegNAYbKAPMAnfP6uC-jdbw)



## Microservices Overview

1. **Product Service**: This microservice manages the products available in the application. It utilizes MongoDB as the database to store product information.

2. **Order Service**: Responsible for handling orders placed by customers. It interacts with the Inventory Service to ensure product availability before processing orders.It utilizes MysqlDB as the database to store order information.

3. **Inventory Service**: Manages the inventory and checks product availability. It is called by the Order Service via OpenFeign.

4. **Notification Service**: Handles notifications related to orders. It listens to Kafka topics for order events published by the Order Service.

<img align="top" alt="Coding" width="400" src="https://cdn.dribbble.com/users/1008970/screenshots/6140230/blog_post_docker.gif">

## Technologies Used

- **Spring Boot**: Used for building microservices.
- **MongoDB**: Database for storing product information.
- **OpenFeign**: Web client for communication between microservices.
- **Eureka Server**: Service registry for registering microservices.
- **Kafka**: Message broker for handling order events.
- **API Gateway**: Provides a single entry point to the microservices.
- **Keycloak**: Open Authorization Server for providing security.
- **Docker**: Containerization of the application.
- **Docker Compose**: Tool for running multi-container Docker applications.
-   <img align="bottom" alt="Coding" width="400" src="https://media.licdn.com/dms/image/D4D12AQEsHFDSjrhHTA/article-cover_image-shrink_720_1280/0/1696402427643?e=2147483647&v=beta&t=4bBAvmFe91uoznge5e-1oaIjf0H5PRaWfdAawW44TRw">


## Setup Instructions

1. Clone this repository.
2. Navigate to the root directory.
3. Run `docker-compose up` to start all the microservices and related services.

## Usage

- Access the Product Service to view available products.
- Place orders using the Order Service.
- Notifications about orders will be handled by the Notification Service.

![kafka architecture](https://www.ionos.com/digitalguide/fileadmin/DigitalGuide/Screenshots_2019/apache-kafka-EN-1.png)

## Contributors

- [Prashanthan V]

Feel free to contribute by opening issues or pull requests!

