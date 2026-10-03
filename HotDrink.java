/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAN
 */
/*
 * Subclass representing Hot Drinks
 */
public class HotDrink extends Drink {
    private String size;

    public HotDrink(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String getInfo() {
        return "[Hot] " + getName() + " (" + size + ") - " + getPrice() + " SAR";
    }
}