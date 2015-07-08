7/7/2015

This is a simple Hello World java project built using maven.

I have built this project using Maven. Below are the steps:

1. Installed maven by downloading it.
2. Set the java home and path to maven bin to run the mvn command.
3. Run -> mvn archetype:generate -DgroupId=com.sonic -DartifactId=JavaHelloWorldMaven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=true
4. Convert to eclipse project using - mvn eclipse:eclipse
6. Import to eclipse and make some pom.xml changes.
7. Run -> mvn clean and mvn install, to create a jar file
