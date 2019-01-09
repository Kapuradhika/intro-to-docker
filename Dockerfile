FROM java

ARG JAR_FILE

COPY ${JAR_FILE} app.jar

EXPOSE ${SERVER_PORT:-8080}

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]