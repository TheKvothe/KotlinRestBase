FROM openjdk:17-oracle
VOLUME /tmp
RUN mkdir /work
COPY . /work
WORKDIR /work
RUN microdnf install findutils
RUN /work/gradlew build
RUN mv /work/build/libs/*.jar /work
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/work/HackUPC-0.0.1-SNAPSHOT.jar"]