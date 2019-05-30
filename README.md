# zoo-application

I have created a spring boot application in java 8.

Steps to run this application-
1. git clone the project.
2. run the command 'mvn clean spring-boot:run' from the root folder of the project in the terminal.
Application will run at localhost 8080.

To test the application, run http://localhost:8080 from the console.
If you see this message in the console:
<i>welcome to the zoo!</i><br />

You have successfully launched the application and you are all set to view some animals and their friendship stories.

<b><i>There are three HTTP request to serve the features described in the Assignment which are mentioned below-</i></b>

## Display list of all animals with their properties and friends' names. (HTTP GET REQUEST)

EndPoint url : http://localhost:8080/api/v1/animals

This endpoint will display list of all animals with their properties and friends at any given time.

## Friendship story of any two friends (HTTP GET REQUEST)

EndPoint url : http://localhost:8080/api/v1/alterFriendship

This url display the friendship status of any one animal with the other. For eg- 

<i>"Dog one has lost friendship with Chicken one; Dog one has
established a friendship with Parrot two."</i>

Here Dog one and Parrot two are picked up randomly from the list of animals. 

If you again hit the url http://localhost:8080/api/v1/animals, you will see the list of animals with updated friends
based on the "alterFriendship" feature. 
In a single session of the application, this list will be updated according to the "alterFriendship" feature.

## Exit (HTTP GET REQUEST)

EndPoint url : http://localhost:8080/exit

This will close the Spring boot application. Hence <i>"Closing the zoo!"</i> will be printed in the terminal .
