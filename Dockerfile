FROM openjdk:8
EXPOSE 8080
ADD target/calculator.jar calculator.jar 
ENTRYPOINT ["java","-jar","/calculator.jar"]