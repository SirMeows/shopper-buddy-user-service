FROM eclipse-temurin:20-jre-ubi9-minimal

ARG JAR_FILE

EXPOSE 8080

WORKDIR /app

COPY ${JAR_FILE} ./shopper-buddy-user-service.jar

COPY start-shopper-buddy-user-service.sh /app/start-shopper-buddy-user-service.sh

RUN chmod +x /app/start-shopper-buddy-user-service.sh

ENTRYPOINT ["/app/start-shopper-buddy-user-service.sh"]