FROM openjdk:8
EXPOSE 7070
ADD target/spring-boot-docker-mysql.jar test1.jar
ENTRYPOINT ["java","-jar","/test1.jar"]