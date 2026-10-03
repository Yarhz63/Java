# Coffee Shop Management System

A Java-based coffee shop ordering system built to demonstrate core **Object-Oriented Programming (OOP)** principles[cite: 9].

## OOP Principles Applied
* **Abstraction:** `Drink` is an `abstract class` forcing subclasses to implement `getInfo()`[cite: 9].
* **Encapsulation:** Private fields and read-only menu access (`Collections.unmodifiableList`)[cite: 9].
* **Inheritance:** `HotDrink`, `ColdDrink`, and `SpecialDrink` extend `Drink`[cite: 9].
* **Polymorphism:** Dynamic method overriding and runtime execution inside `Order`[cite: 9].

##  Project Architecture
* `Drink` (Abstract Parent Class)[cite: 9]
* `HotDrink`, `ColdDrink`, `SpecialDrink` (Concrete Subclasses)[cite: 9]
* `Customer` & `Order` (Order Processing)[cite: 9]
* `Menu` (Encapsulated Drink Catalog)[cite: 9]
* `CoffeeSystem` (Main Entry Point)[cite: 9]

##  How to Run
```bash
javac *.java
java CoffeeSystem

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/coffee-shop-system.git](https://github.com/your-username/coffee-shop-system.git)
