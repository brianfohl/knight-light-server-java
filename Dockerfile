FROM artifactory.cloud.cms.gov/docker/alpine:3.18.2
WORKDIR /app
COPY . /app/
EXPOSE 8080

RUN apk update
RUN apk add openjdk11
RUN apk add maven

RUN export PATH=${PATH}:${JAVA_HOME}/bin
RUN mvn clean install

CMD [ "java", "-jar", "target/knightlight-java-0.0.1-SNAPSHOT.jar"]