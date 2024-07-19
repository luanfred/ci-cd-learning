FROM openjdk:17-slim

WORKDIR /app

COPY . .

RUN apt-get update && apt-get install -y maven

RUN mvn clean test -B package --file pom.xml

CMD ["java", "-jar", "target/learning-ci-cd-1.0-SNAPSHOT.jar"]