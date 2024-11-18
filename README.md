# Spring RestController JSON/XML - Comptes

## Description
This project is a simple Spring Boot application that exposes a `Compte` resource via a RESTful API, supporting both JSON and XML responses. The application provides CRUD operations (Create, Read, Update, Delete) on `Compte` entities, which represent bank accounts. Users can access and manipulate account data in either JSON or XML format, based on the `Accept` header in the request.

The project demonstrates how to handle content negotiation in Spring Boot to provide responses in multiple formats (JSON and XML) based on the client's preference.

## Requirements
- Java 21
- Spring Boot 3.3.5
- Maven 
- Spring Web
- Spring Data JPA
- H2 Database
- Postman or any API testing tool (for testing the API)

## How to Setup
1. **Clone the repository:**
   ```bash
   git clone https://github.com/marouanedbibih/Spring-Boot-RestController-JSON-XML
   ```

2. **Navigate to the project directory:**
   ```bash
   cd Spring-Boot-RestController-JSON-XML
   ```

3. **Build the project using Maven:**
   ```bash
   mvn clean install
   ```

4. **Run the Spring Boot application:**
   ```bash
   mvn spring-boot:run
   ```

5. **Access the application:**
   The application will be running on `http://localhost:8082`. You can use Postman or any other API tool to test the endpoints.

## Folder Structure

```bash
restcontroller-json-xml/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/
│   │   │       └── marouanedbibih/
│   │   │           └── restcontrollerjsonxml/
│   │   │               ├── controllers/
│   │   │               │   └── CompteController.java  # Controller for Comptes
│   │   │               ├── models/
│   │   │               │   ├── Compte.java            # Entity class for Compte
│   │   │               │   └── TypeCompte.java        # Enum for account types
│   │   │               ├── repositories/
│   │   │               │   └── CompteRepository.java  # Repository for Compte CRUD operations
│   │   │               └── RestcontrollerJsonXmlApplication.java  # Main application class
│   ├── resources/
│   │   ├── application.properties  # Configuration file for application settings
│   │   ├── static/                 # Static files (if any)
│   │   └── templates/              # Template files (if any)
├── test/
│   └── java/
│       └── org/
│           └── marouanedbibih/
│               └── restcontrollerjsonxml/
│                   └── RestcontrollerJsonXmlApplicationTests.java  # Test class
```

## Features
- **CRUD Operations**: Create, Read, Update, and Delete `Compte` entities.
- **Content Negotiation**: Supports both JSON and XML formats via the `Accept` header.
- **Spring Boot Integration**: Easily configurable with Spring Boot and Spring Data JPA.
- **RESTful API**: Provides a clean, RESTful interface for accessing `Compte` data.

## Resume
This Spring Boot application demonstrates the use of REST controllers to expose a resource (`Compte`) with JSON and XML support. It highlights the use of content negotiation to send data in the format preferred by the client, either JSON or XML. The application is designed for educational purposes and can be easily extended to handle more complex banking scenarios.

## Contact
For more information or to report issues, please feel free to reach out:

**Email**: marrouane.dbibih@gmail.com
