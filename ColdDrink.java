/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAN
 */
public class ColdDrink extends Drink {
    private boolean hasIce; // هل يحتوي على ثلج أم لا

    public ColdDrink(String name, double price, boolean hasIce) {
        super(name, price);
        this.hasIce = hasIce;
    }

    public boolean isHasIce() {
        return hasIce;
    }

    @Override
    public String getInfo() {
        String iceText = hasIce ? "With Ice" : "No Ice";
        return "[Cold] " + getName() + " (" + iceText + ") - " + getPrice() + " SAR";
    }
}
