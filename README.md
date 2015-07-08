# java-j2ee-projects
List of all Java and J2EE projects, created on 7/7/2015

----------------------------------------------------------------------------------------
7/7/2015
Project Created - Struts2HelloWorldXML

This is a simple Hello World project built using Struts 2 with help of struts.xml.

Hit the following url to start - 
http://localhost:8080/Struts2HelloWorldXML/user/login
----------------------------------------------------------------------------------------


----------------------------------------------------------------------------------------
7/7/2015
Project Created - JavaHelloWorldMaven

This is a simple Hello World java project built using maven. I have built this project using Maven. Below are the steps:

1. Installed maven by downloading it.
2. Set the java home and path to maven bin to run the mvn command.
3. Run -> mvn archetype:generate -DgroupId=com.sonic -DartifactId=JavaHelloWorldMaven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=true
4. Convert to eclipse project using - mvn eclipse:eclipse
6. Import to eclipse and make some pom.xml changes.
7. Run -> mvn clean and mvn install, to create a jar file
----------------------------------------------------------------------------------------


----------------------------------------------------------------------------------------
7/7/2015
Project Created - Struts2HelloWorldAnnotations

This is a simple Hello World project built using Struts 2 with help of annotations. I have built this project using Maven. Below are the steps:

1. Installed maven by downloading it.
2. Set the java home and path to maven bin to run the mvn command.
3. Run -> mvn archetype:generate -DgroupId=com.sonic -DartifactId=Struts2HelloWorldAnnotations -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
4. A web module will be created with directory structure.
5. Convert to web eclipse project using - mvn eclipse:eclipse -Dwtpversion=2.0
6. Import to eclipse and make some pom.xml changes.
7. Run -> mvn install, to create a war file of the project and copy to tomcat.
8. Now the basic module is ready to be deployed, make struts2 specific changes and deploy.

Hit the following url to start: http://localhost:8080/Struts2HelloWorldAnnotations/user/login
----------------------------------------------------------------------------------------
