# Stock-Exchange-Web
Stock Market Charting Application 
Complete backend using JAVA, Spring Framework, Hibernate with RESTful services.
FrontEnd Templates Completed but not integrated with the backend due to some errors.

### Spring Boot Application
The project was created with https://start.spring.io/ 
with Spring Web Starter, Spring Boot DevTools, Spring Security dependencies. As, Spring Boot Applications are Auto Configured with dependencies saving the configuration time.


### Spring Framework
The Spring framework has emerged as a solution to all these complications. This framework uses various new techniques such as Aspect-Oriented Programming (AOP), Plain Old Java Object (POJO), and dependency injection (DI), to develop enterprise applications, thereby removing the complexities involved while developing enterprise applications.

### Hibernate Framework
Hibernate is a ORM framework which provides some abstraction layer, meaning that the programmer does not have to worry about the implementations, Hibernate does the implementations for you internally like Establishing a connection with the database, writing query to perform CRUD operations etc. 


### 1.1 Features
    # User SignUp and Login with JWT and Spring Security.
    # Uploading and Reading of Excel Files for Stock Price.
    # Micro Services created for different Components of the Application at the backend to follow MVC architechture.
    # Comparisons of Stocks for a specific Period.
    # Managing Companies
    # Managing Stock Exchanges
    # Managing Sectors
    # Managing Stock Prices
    # Managing IPO services
    # Managing Users
    
### 1.2 Implementation
    # Front End was done using HTML, JSP, CSS and Bootstrap.(Error while integrating with Spring Restful Services as backend)
    # Backend uses JAVA,MySQL as database.
    
### 1.3 Running the Project
    # To Run the Code use "git clone https://github.com/dipanjannC/Stock-Exchange-Web.git".
    # Use MySQL workbench to create and use the database by following two commands
      create database stock_db;
      use stock_db;
    # Import the folder into eclipse as a "Existing MAVEN project".
    # Run the "StockExchangeApplication.java".
    
### 1.4 Testing the Project
    # POSTMAN is required to test the project.
    # Then put "localhost:9094/token/signup" as a POST request In POSTMAN.
    with 
       {
	      "username":"dipanjan",
      	"password":"dipanjan",
      	"usertype":"admin",
	      "email":"dipanjan@gmail.com",
      	"mobileNumber":7064011767,
	      "confirmed":1
       }
      at Header - Content-Type: application/json 
      
    # To login use "localhost:9094/token/generate-token" as POST request .
    with 
       {
        "username":"dipanjan",
        "password":"dipanjan"
       }
       
    # Put the token - "$2a$10$d3NtLTrbFDfNZPeRG7b42O8GdFt1jKyHuObp2rrVQ13BNZUJMSsqy" at  Authorization : Bearer to use rest of the            endpoints. 
    # Use the rest of the endpoints to explore more of the services/functionalities.
