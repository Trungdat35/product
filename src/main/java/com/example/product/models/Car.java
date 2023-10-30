package com.example.product.models;

public class Car{
   private String name;
   private String brand;
   private String color;
   private String material;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBard() {
        return brand;
    }

    public void setBard(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public  void display(){
        System.out.println(getName()+" "+getBard());
    }
}
