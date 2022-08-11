/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesSofka;

import java.util.ArrayList;

/**
 *
 * @author angel_000
 */
public class Fruit {
   
    
    String name;
    private float averageWeight;
    //declaracion array list
    ArrayList<String> color;

    public Fruit() {
    }
    
   

    public Fruit(String name, float averageWeight,ArrayList color) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.color =color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public ArrayList<String> getColor() {
        return color;
    }

    public void setColor(ArrayList<String> color) {
        this.color = color;
    }
    
    
    
}
