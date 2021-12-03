# IMS - Team Eccentric Predators

Inventory Management System by Eccentric Predators.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

Database: Mysql
JDK version: 8
IDE(optional): Intellij

Install Mysql server on your local machine, and change the password of the root user.

### Installing

First, clone the git repo.

```
git clone https://github.com/g2archie/IMS-Starter.git
```

You will need to edit the db.properties accordingly.
```
db.url=jdbc:mysql://localhost:3306/ims?serverTimezone=UTC
db.user=root
db.password=root
```

You can run the application(src/main/java/Runner.java) directly using Intellij.

or 

```
mvn package
java -jar .\target\ims-0.0.1-jar-with-dependencies.jar
```

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Explain what these tests test, why and how to run them

```
mvn test
```

### Integration Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
