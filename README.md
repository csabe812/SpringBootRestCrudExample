
# SpringBootRestCrudExample
SpringBootRestCrudExample: This is a very basic implementation of a spring boot CreateReadUpdateDelete application.

What I used:
 - Maven: https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip
	 - How to install Maven: https://mkyong.com/maven/how-to-install-maven-in-windows/
 - STS: https://spring.io/tools
	 - To run: `java -jar YourCurrentSTSjarFile.jar`
 - JDK: https://www.oracle.com/java/technologies/javase-downloads.html
	 - JAVA_HOME: https://mkyong.com/java/how-to-set-java_home-on-windows-10/
 - MongoDB Community Server: https://www.mongodb.com/try/download/community
	 - How to setup a local MongoDB Connection: https://zellwk.com/blog/local-mongodb/
 - Postman: https://www.postman.com/downloads/
	 - Perfect tool for checking REST connections

# Structure:
Domain: Java POJO
Controller: REST controlling
Repository: very basic MongoRepository
Service: MISSING (just the controller calls the repository layer)
Configuration: MISSING (note: no authentication is required for the REST endpoints)
