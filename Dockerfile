FROM openjdk:11
VOLUME /tmp
EXPOSE 8081
ADD ./target/config-server-bank-0.0.1-SNAPSHOT.jar config-server-bank.jar
ENTRYPOINT ["java","-jar","config-server-bank.jar"]