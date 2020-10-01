# CITY SERVICE

A microservice that gives information about the cities and connections in a DB

* This microservice is implemented using Spring Boot, Spring Cloud and PostgreSQL
* The instructions below are for Debian based systems, in particular Ubuntu.


## City DB

The DB has two tables:

* A table that stores cities with the following attributes:
    * id
    * name
* A table that stores connections and time
    * city_origin
    * city_destination
    * departure
    * arrival

There are some script to populate the DB in `/db`
  
## Dependencies

* Java 8 or Docker
    
## Instructions to run the whole project

Here are the instructions to run the project (without docker):

1. Clone **this** repository, in your PC (git clone)
2. Execute the following command to export env variable an run the project: 
```
cd city-service/config
export $(cat config.env | xargs)
cd ../
./mvnw spring-boot:run
```
3. You will be able to access its api in `http://<ip_city_service>:8090/swagger-ui.html`
