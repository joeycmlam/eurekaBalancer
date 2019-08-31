#docker file for eureka server

FROM openjdk:12

MAINTAINER jlam <joey.cm.lam@gmail.com>

ADD eurekaBalancer-0.0.1-SNAPSHOT.jar eurekaBalancer-0.0.1-SNAPSHOT.jar

EXPOSE 9091

ENTRYPOINT java -jar eurekaBalancer-0.0.1-SNAPSHOT.jar

