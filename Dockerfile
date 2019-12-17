FROM openjdk:13-alpine

RUN mkdir /app
COPY build/libs/Mappy-*-all.jar /app
RUN mv /app/Mappy-*-all.jar /app/Mappy.jar

WORKDIR /app

CMD ["java", "-jar", "/app/Mappy.jar"]
