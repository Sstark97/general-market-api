FROM amazoncorretto:17-alpine3.18
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/general-market-0.0.1-SNAPSHOT.jar /app/general-market-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java"]
CMD ["-jar", "/app/general-market-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=prod"]
