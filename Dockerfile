FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/spring-docker-1.0.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]