FROM registry.access.redhat.com/ubi8/ubi-minimal:8.4
WORKDIR /work/
RUN chown 1001 /work \
    && chmod "g+rwX" /work \
    && chown 1001:root /work
COPY --chown=1001:root ./code-with-quarkus-client/target/code-with-quarkus-client-1.0.0-SNAPSHOT-runner.exe /work/application

EXPOSE 8080
USER 1001

CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]