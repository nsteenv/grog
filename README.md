GROovy static website Generator (grog)
===============================

The purpose of this project is to help you get started with Groovy (as well as generate static websites occasionally).
The project makes use of standard groovy tools such as Gradle (for build) and Spock (for specs).
It also makes it easy to create an Eclipse or IDEA project, allowing you to run the app from within your IDE.
The Gradle build will automatically download all required dependencies, compile the project, and finally run the Spock specs. 
If you don't have Gradle installed the Gradle build goes one step further by bootstrapping itself, alleviating the need to have a build tool preinstalled.
Just use the Gradle Wrapper (gradlew) instead.

Prerequisites
-------------
- JDK 6 or higher

Building with Gradle
--------------------
Type: ./gradlew clean test

Downloaded files (including the Gradle distribution itself) will be stored in the Gradle user home directory (typically "<user_home>/.gradle").

Creating an Eclipse project
---------------------------
Type: ./gradlew cleanEclipse eclipse

Make sure you have a recent version of the Groovy Eclipse plugin installed. After importing the generated project into a workspace, go to Preferences->Java->Build Path->Classpath Variables and add a variable named GRADLE_CACHE with value "<user_home>/.gradle/cache". (If you have an environment variable GRADLE_USER_HOME set, the correct value is "<GRADLE_USER_HOME>/cache".) You should now be able to build the project, and to run the specs like you would run a JUnit test. See http://wiki.spockframework.org/GettingStarted#Eclipse for more information on how to get started with Spock and Eclipse.

Creating an IDEA project
---------------------------
Type: ./gradlew cleanIdea idea

Open the generated project in IDEA. You should now be able to build the project, and to run the specs like you would run a JUnit test.

Further Resources
-----------------
Groovy homepage http://groovy.codehaus.org
Gradle homepage	http://www.gradle.org
Gradle documentation    http://www.gradle.org/documentation
Spock homepage  http://spockframework.org
Spock documentation http://wiki.spockframework.org/SpockBasics

If you have any comments or questions, please do not hesitate to contact me. All feedback is appreciated!

Happy groov'ing!
Vincent Van Steenbergen

