#Cloud Fundamentals

Two options for hosting our app
-on premise 
-on the cloud 

##On Premise

worry about security and routing 
worry about buying all the equipment and up front costs that come along with that
hire people to maintain and run that equipment


## Cloud Computing Definition

Utilizing resources from a server across the internet 
- Just a computer running somewhere that you have access to 
- Similar to rent memory/computing power from that computer on the internet

Offering infrastructure, resources, or applications over the internet

Why Cloud computing?
- More flexibility 
- More scalable, and easier to scale
- More cost-effective 
- More availability 
- Fault tolerance 

## Cloud Computing Models 

Infrastructure as a Service
- renting out some server, where we have to manage
- amazon EC2
    - OS
    - DATA
    - RUNTIME
    - APPLICATIONS
  
Platform as a Service
- renting some server that is preconfigured with service you need
- amazon RDS
    - DATA
    - APPLICATIONS
  

Software as a Service
- renting some software running on their servers 
- Eg- Google Docs
    - everything is being managed by the cloud provider, you just use the application 

## Cloud Computing Service Providers

AWS - Amazon Web Services
AZURE - (Microsoft)
GCP - Google Cloud Platform 

##  AWS - Amazon Web Services
- Comprehensive cloud computing software 
- Provides programmers with a wide range of computing services over the cloud, to aid in the development and deployment of applications 
  - Storage, database, machine learning, servless features, computing power

Why AWS?
- Cheaper than building infrastructure
  - pay-per-use/subscription model
  - no need to buy all the equipment to host server
- More scalable than in house solutions 
  - Automatically scale resources during heavy traffic time
- Globally distribute products easily 
  
 AWS Regions and Availability Zones
  - AWS hosts its services across 77 availability zones in 24 regions
  - Region: geographic location
  - Availability Zone: physical building where Amazon server live 
    - Regions are made up of multiple availability zones
    

## Security and Access 

VPC - Virtual Private Cloud

- Virtualized network 
  - Allow multiple resources to share a private network, and communicate with one another without being publicly accessible 

Security Groups 
- Virtual firewalls 
- allow protocol and port level access to services
    - amazon uses block everything 
    - make whitelist 
- set of rules to filter incoming and outgoing traffic, this is how we can open up a port publicly to a service
- 

