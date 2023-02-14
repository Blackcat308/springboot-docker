FROM maven:3.8.1 AS package

ADD ./pom.xml pom.xml

ADD ./src src/

RUN mvn clean package

FROM openjdk:8u102 AS JDK

ENV TZ=Asia/Shanghai

ENV JAVA_OPTS="-Xms512m -Xmx1024m -Djava.security.egd=file:/dev/./urandom"

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY --from=package /target/springboot-docker-*.jar sbd.jar

EXPOSE 8889

CMD java $JAVA_OPTS -jar sbd.jar


