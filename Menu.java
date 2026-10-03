/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAN
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Menu {
    private final ArrayList<Drink> drinks = new ArrayList<>();

    public void addDrink(Drink drink) { 
        drinks.add(drink);
    }

    // حماية القائمة بإرجاع نسخة للقراءة فقط
    public List<Drink> getDrinks() { 
        return Collections.unmodifiableList(drinks);
    }

    public void showMenu() {
        System.out.println("\n---- Coffee Shop Menu ----");
        for (int i = 0; i < drinks.size(); i++) { 
            System.out.println((i + 1) + ". " + drinks.get(i).getInfo()); 
        }
    }
}
