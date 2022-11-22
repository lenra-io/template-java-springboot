# syntax=docker/dockerfile:1.4

# builder
FROM openjdk:20-ea-11-jdk as builder
WORKDIR /app
ADD --link . ./
RUN \
    ./mvnw package && \
    mv target/ /tmp/

# of-watchdog
FROM ghcr.io/openfaas/of-watchdog:0.9.6 as of-watchdog

# runtime
FROM openjdk:20-ea-11-jdk as runtime
ENV \
    fprocess="java -jar template-0.0.1-SNAPSHOT.jar"\
    upstream_url="http://127.0.0.1:3000"\
    LOG_LEVEL="debug"\
    mode="http"\
    exec_timeout="0"
WORKDIR /app
COPY --link --chown=1000:1000 --from=builder "/tmp/target" "/app/"
COPY --link --chown=1000:1000 --from=of-watchdog "/fwatchdog" "/fwatchdog"
USER 1000
EXPOSE 8080
CMD ["/fwatchdog"]
