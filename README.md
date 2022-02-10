#Spring Boot Project With Kafka

A Spring Boot Project to produce and consume json With Kafka

### <U>Installation</U>

The application is built using gradle and all the dependencies will be added automatically

###Prerequisites

https://docs.confluent.io/platform/current/installation/installing_cp/zip-tar.html#prod-kafka-cli-install

https://docs.confluent.io/confluent-cli/current/install.html

####Build the application:
```
gradle build
```

For Running Application in local:
```
$ gradle bootrun

```

#### Use PostMan to test the application using the below API endpoint:

```
http://localhost:9000/kafka/publish

{
"userId": 1,
"firstName" :"Amit",
"lastName" :"Kumar"
}

```

#### Refer below document for more details

https://howtodoinjava.com/kafka/spring-boot-jsonserializer-example/

https://stackoverflow.com/questions/51688924/spring-kafka-the-class-is-not-in-the-trusted-packages




