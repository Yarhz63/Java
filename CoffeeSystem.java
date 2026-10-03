/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author RAN
 */
import java.util.Scanner;

public class CoffeeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Menu menu = new Menu();
        
        // تنويع القائمة بكلاسات مختلفة ترث من Drink
        menu.addDrink(new HotDrink("Cappuccino", 14, "Medium"));            // مشروب ساخن
        menu.addDrink(new ColdDrink("Iced Americano", 12, true));          // مشروب بارد
        menu.addDrink(new SpecialDrink("Ice Matcha Latte", 18));           // مشروب خاص

        System.out.print("Enter your name: ");
        Customer customer = new Customer(input.nextLine());

        Order order = new Order(customer);
        int choice;

        do {
            menu.showMenu();
            System.out.print("Choose drink number (0 to finish): "); 
            choice = input.nextInt();
            if (choice > 0 && choice <= menu.getDrinks().size()) { 
                order.addDrink(menu.getDrinks().get(choice - 1)); 
                System.out.println("Added to order!");
            }
        } while (choice != 0); 

        // طباعة الفاتورة النهائية
        order.printOrder();
    }
}