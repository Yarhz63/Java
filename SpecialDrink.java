/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAN
 * 
 * Subclass representing Special Drinks
 */
public class SpecialDrink extends Drink {

    public SpecialDrink(String name, double price) { 
        super(name, price);
    }

    @Override
    public String getInfo() {
        return "[Special] " + getName() + " - " + getPrice() + " SAR"; 
    }
}