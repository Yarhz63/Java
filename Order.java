/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAN
 */
import java.util.ArrayList;
// Class that represents a customer's order 
public class Order {
 private Customer customer; // Customer placing the order 
 private ArrayList<Drink> orderedDrinks; // List of selected drinks
 // Constructor
 public Order(Customer customer) { 
 this.customer = customer; 
 this.orderedDrinks = new ArrayList<>(); 
 }
 // Add a drink to the order
 public void addDrink(Drink drink) { 
 orderedDrinks.add(drink);
 }
 // Calculate total bill
 public double calculateBill() { 
 double total = 0;
 for (Drink d : orderedDrinks) { 
 total += d.getPrice();
 }
 return total;
 }
 // Print receipt
 public void printOrder() {
     System.out.println("\n---- Order Summary----");
      System.out.println("Customer: " + customer.getName());
 for (Drink d : orderedDrinks) { 
 System.out.println("- " + d.getInfo()); 
 }
 System.out.println("Total: " + calculateBill() + " SAR"); 
 }
}

