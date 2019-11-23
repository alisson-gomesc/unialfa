

## Iniciando Consul


Consul host:

    http://localhost:8500/ui/

## Iniciando zipkin

Download Zipkin
https://zipkin.io/pages/quickstart.html

Zipkin é um sistema de rastreamento distribuído. Para iniciá-lo:


    java -jar zipkin.jar


Zipkin host:

    http://localhost:9411/


## Broker RabbitMQ


RabbitMQ host:

    http://localhost:15672/

## Estado do Serviço

- http://localhost:<port>/acme-car/health
- http://localhost:<port>/acme-fly/health
- http://localhost:<port>/acme-hotel/health
- http://localhost:<port>/acme-pay/health
- http://localhost:<port>/acme-travel/health


# Requests

    http://localhost:8580/acme-travel/car
    
    {
      "name" : "HB20",
      "customer" : "Carlos",
      "type" : "CAR",
      "status" : "REQUEST",
      "initialDay" : 1574479802690,
      "endDay" : 1574479802690,
      "price" : 30.0
    }


## Endpoint Actuator

Shows application health information (a simple ‘status' when accessed over an unauthenticated connection or full message details when authenticated); it's not sensitive by default

    http://localhost:8580/actuator/health
 
Displays arbitrary application info; not sensitive by default
   
    http://localhost:8580/actuator/info

Shows ‘metrics' information for the current application; it's also sensitive by default

    http://localhost:8580/actuator/metrics

Displays trace information (by default the last few HTTP requests)

    http://localhost:8580/actuator/trace
    
