#!/bin/bash
export KAFKA_HOST="localhost:9092"
export KAFKA_TOPIC="TOPICO_1"

export className=App
echo "## Running $className..."
mvn exec:java -Dexec.mainClass="br.com.kafka_producer.$className"