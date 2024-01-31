
<a name="Kotlin-Spring-Angular"></a>



<!-- Website view -->
## Website view

<br />
<img src="https://i.postimg.cc/65ywpsG1/home.png" alt="home">
<br />
<img src="https://i.postimg.cc/ydD4YcD3/add.png" alt="add">
<br />
<img src="https://i.postimg.cc/28FJY20X/edit.png" alt="edit">
<br />
<img src="https://i.postimg.cc/GtRQS1n3/search.png" alt="search">
<br />
<img src="https://i.postimg.cc/YCLWgyTd/delete.png" alt="delete">
<br />



<!-- ABOUT THE PROJECT -->
## About The Project


This is a Web project made from Angel Doychev made to manage employees in a firm.
The project's back-end was wrtitten in Kotlin With Spring. The front-end 
was build with Angular and written in TypeScript, html, css. 



<!-- Build with -->
### Built With

This section lists the major dependecies used in the project:

* Kotlin
* TypeScript
* Angular
* Spring boot
* Spring Data JPA
* MySql Driver
* Bootstrap


<!-- How to run -->
## How to run

First download and run the back-end kotlin program in order to initialize a new MySql database.
The process is automatic and creates tha database whenever you first run the program.
Then you have to download the Angular cli with this command: (npm install -g @angular/cli).
After that you can create a new Angular project: (ng new my-first-project).
Go to the directory of the project: (cd my-first-project).
Paste my project there and use this command to run the front-end: (ng serve)
The app is run on Angulars default port '4200' and uses port '8080' to run functions
from the back-end. In order to use functions from different ports the cors config is 
done in the WebConfiguration file in the config folder.
When all is done you can use the app freely.



<!-- Entities -->
## Entities

The entities were instantiated using jakarta.persistance JPQL with the @Entity annotation.

- Employee


<!-- MVC architecture -->
## MVC Architecture 

The MVC architecture type was used in order to structure the application in a way that 
makes it easier to digest. The program is structured as follows.

- config (all app configurations are stored here)
- model (entities, Dtos and Enumerations are stored here)
- repository (For every entity a repositories was created which uses  springframworks JpaRepository in order to generate functions from pre-done JPQL)
- security (A CurrentUser class was created that lives in the @Sessionscope and stores the state of the user and if the user is anonymous or logged in)
- service (All of the logic is stored in the services in order to create a Facade design pattern)
- web (All of the controllers which link the back end to the frontend are stored here)



<!-- USAGE EXAMPLES -->
## Usage

- You can add new Employees to the database from the front end web service
- You can delete Employees from the databse with the front end web service
- You can edit Employees in the database from the front end web service
- You can search for employees by every public property they have


<!-- CONTACT -->
## Contact

Angel Doychev - Email: angeldoychev285@abv.bg Phone-number: 0882704879

Project Link: [https://github.com/AngelDoychev/Kotlin-Spring-Angular](https://github.com/AngelDoychev/Kotlin-Spring-Angular)


