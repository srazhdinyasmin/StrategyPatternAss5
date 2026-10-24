# Strategy Pattern – Navigation System

## Project Overview

This project demonstrates the Strategy Design Pattern in Java using a simple navigation system. The program calculates estimated travel time based on different transportation modes.

The main idea is to allow the user to switch between different travel strategies at runtime without changing the Navigator class.

## Strategy Pattern Implementation

The project includes the following components:

- **RouteStrategy** – a common interface that declares the `calculateTime()` method.
- **CarStrategy** – calculates travel time using an average speed of 60 km/h.
- **WalkStrategy** – calculates travel time using an average speed of 5 km/h.
- **CycleStrategy** – calculates travel time using an average speed of 15 km/h.
- **Navigator** – the Context class that stores the selected strategy and delegates travel time calculation.
- **Main** – the Client class that creates strategies and demonstrates runtime switching.

## How It Works

Each strategy implements the `RouteStrategy` interface and provides its own calculation based on the formula:

Travel Time = Distance / Speed

The `Navigator` class uses the selected strategy through the common interface. The strategy can be changed using the `setStrategy()` method.

## Example Output

For a distance of 30 km:

```text
Car: 0.5 hours
Walking: 6.0 hours
Cycling: 2.0 hours
```

## Clean Code Principles

The implementation follows principles discussed in Chapters 9, 10, and 11 of Robert C. Martin's *Clean Code*.

- Unit Testing and Single Concept per Test (Chapter 9)
- Single Responsibility Principle (Chapter 10)
- High Cohesion (Chapter 10)
- Organizing for Change (Chapter 10)
- Dependency Injection (Chapter 11)

## Technologies

- Java 17
- IntelliJ IDEA
- Git and GitHub
- PlantUML (UML class diagram)

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure JDK 17 is configured.
4. Open `Main.java` in the `navigation` package.
5. Run the `main()` method to see the travel time calculations.

## Reference

Robert C. Martin, *Clean Code: A Handbook of Agile Software Craftsmanship*, Chapters 9–11.