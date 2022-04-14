#!/bin/bash
export KAFKA_HOST="192.168.0.19:9092"
export KAFKA_TOPIC="TOPICO_1"

export CLASSPATH=target/kafka_producer-1.0-SNAPSHOT.jar
export className=App
echo "## Running $className..."
shift
mvn exec:java -Dexec.mainClass="br.com.kafka_producer.$className"