/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAN
 */

/*
 * Abstract Parent Class representing a general Drink
 */
public abstract class Drink { 
    private String name; 
    private double price; 

    public Drink(String name, double price) { 
        this.name = name;
        this.price = price;
    }

    public String getName() { 
        return name; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }

    public double getPrice() { 
        return price; 
    }

    public void setPrice(double price) { 
        if (price > 0) { // حماية البيانات
            this.price = price; 
        }
    }

    // Abstract method: إجبار الكلاسات الفرعية على تحديد تفاصيل العرض (Abstraction)
    public abstract String getInfo();
}