Overview

The Real-Time Local Service Finder is a basic Java console application designed to help users view, search, and update the availability status of local services such as pharmacies, hospitals, and grocery stores. The project demonstrates core Java concepts including object-oriented programming, list management, and simple user interaction through a console-based menu.

This application serves as a Minimum Viable Product (MVP) built within a short development timeline. It provides a foundation that can be extended into a full-featured web or mobile application in the future.

Features

View all available services

Search services by category

Update service availability (Open/Closed)

Simple console-based user interface

No database or external dependencies required

Project Structure
src/
 ├─ Main.java            - Application entry point and menu interface
 ├─ Service.java         - Model class representing a service entity
 └─ ServiceManager.java  - Logic for storing, searching, and updating services

Requirements

Java Development Kit (JDK) 8 or higher

Any Java-compatible IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

How to Run

Download or clone the repository.

Open the project in your preferred Java IDE.

Ensure that the JDK is properly configured.

Run the Main.java file.

Use the on-screen menu to interact with the application.

Example menu:

1. View all services
2. Search services by category
3. Update service status
0. Exit

Example Output
City Hospital | Doctor | Main Road | OPEN
Sharma Medical Store | Pharmacy | Market Area | CLOSED
24x7 Grocery | Grocery | Bus Stand | OPEN

Future Enhancements

The project can be extended with:

User authentication and service provider roles

Database integration (MySQL, PostgreSQL, MongoDB)

REST API using Spring Boot

Web or mobile user interface

Location-based search

Real-time updates using WebSockets

Purpose

This project is intended for learning and demonstration purposes. It highlights fundamental programming concepts and provides a starting point for more advanced real-world applications related to local service discovery and availability tracking.

License

This project is open-source and free to use for educational and developmental purposes.

Author

Aradhya Mishra
