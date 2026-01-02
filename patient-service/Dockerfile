FROM eclipse-temurin:25-jdk-alpine
WORKDIR /docker-service
COPY target/patient-service-0.0.1-SNAPSHOT.jar /docker-service/patient-service.jar
EXPOSE 7010
ENTRYPOINT ["java","-jar","patient-service.jar"]


#FROM eclipse-temurin:25-jdk-alpine AS builder
#
#WORKDIR /docker-service
#COPY pom.xml /docker-service
#
#RUN mvn dependency:go-offline -B
#COPY src /docker-service/src
#
#RUN mvn -B clean package -DskipTests
#
#FROM openjdk:21 AS runner
#WORKDIR /docker-service
#COPY --from=builder /docker-service/target/patient-service.jar patient-service.jar
#
## Provide sensible defaults for Postgres; can be overridden at runtime or via compose
#ENV SPRING_DATASOURCE_URL=jdbc:postgresql://patient-service-db:5000/db
#ENV SPRING_DATASOURCE_USERNAME=admin_user
#ENV SPRING_DATASOURCE_PASSWORD=root
#
#EXPOSE 7010
## Allow passing extra JVM options via JAVA_OPTS if desired
#ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar patient-service.jar"]
