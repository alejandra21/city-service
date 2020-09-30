From openjdk:8
copy ./target/city-service-0.0.1-SNAPSHOT.jar city-service-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","city-service-0.0.1-SNAPSHOT.jar"]