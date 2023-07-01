mvn package
docker build . -t olejatorqq/cats-api:1.0.0
mvn clean
docker push olejatorqq/cats-api:1.0.0