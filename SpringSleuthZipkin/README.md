
**spring-boot-dataservice2* : data services  1 - will be invoked by customerservice first

**spring-boot-dataservice1**: data services  1 - will be invoked by customerservice second

**spring-boot-customerservice**: Sample SpringBoot application which is main customer service


#### How to run?

RUN all services

SpringSleuthZipkin cd spring-boot-dataservice1

spring-boot-dataservice1> mvn clean package spring-boot:run

SpringSleuthZipkin cd spring-boot-dataservice2

spring-boot-dataservice2> mvn clean package spring-boot:run

SpringSleuthZipkin cd spring-boot-dataservice1

spring-boot-customerservice> mvn clean package spring-boot:run


