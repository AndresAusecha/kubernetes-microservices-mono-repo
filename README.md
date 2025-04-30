# KUBERNETES MICROSERVICES ARCHITECTURE

## Development components

This development experiment is only a way in which a microservices architecture can be configured using a BFF.
The components of the architecture are two Springboot kotlin microservices which connect each other via direct HTTP calls, and then a BFF that is not exposed to the outside, this BFF is in charge of simplifying the connection from the frontend side to the backend services.

## kubernetes description

There exist one docker image per micro-service and BFF, in each folder there also exist one deployment, some services and one loadbalancing file, the deployment files have the definition of the what should be the pod, as well as ports, specs and metadata, the services are the interfaces to connect those pods to the rest of the cluster or the outside (in the case of the BFF).

### Service discovery in the cluster

Since every pod has its own service, then the name and port of the service are used in order to find the pod, this configuration allows flexibility to scale up without compromising the discovery, since the services are loadbalancing the connecting the pods. 

## database
The database chosen was PostgreSQL since its the easiest one to install
