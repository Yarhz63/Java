#  Coffee Shop Management System

A Java-based coffee shop ordering system built to demonstrate core **Object-Oriented Programming (OOP)** principles.

##  OOP Principles Applied
* **Abstraction:** `Drink` is an `abstract class` forcing subclasses to implement `getInfo()`.
* **Encapsulation:** Private fields and read-only menu access (`Collections.unmodifiableList`).
* **Inheritance:** `HotDrink`, `ColdDrink`, and `SpecialDrink` extend `Drink`.
* **Polymorphism:** Dynamic method overriding and runtime execution inside `Order`.

##  Project Architecture
* `Drink` (Abstract Parent Class)
* `HotDrink`, `ColdDrink`, `SpecialDrink` (Concrete Subclasses)
* `Customer` & `Order` (Order Processing)
* `Menu` (Encapsulated Drink Catalog)
* `CoffeeSystem` (Main Entry Point)

##  How to Run
```bash
javac *.java
java CoffeeSystem
