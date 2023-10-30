package com.example.product.models;

public class Pizza {
    private String size;
    private int quantityCheese;

    private int quantityPepperoni;
    private int quantityToppings;

    public Pizza(String size, int quantityCheese, int quantityPepperoni, int quantityToppings) {
        this.size = size;
        this.quantityCheese = quantityCheese;
        this.quantityPepperoni = quantityPepperoni;
        this.quantityToppings = quantityToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantityCheese() {
        return quantityCheese;
    }

    public void setQuantityCheese(int quantityCheese) {
        this.quantityCheese = quantityCheese;
    }

    public int getQuantityPepperoni() {
        return quantityPepperoni;
    }

    public void setQuantityPepperoni(int quantityPepperoni) {
        this.quantityPepperoni = quantityPepperoni;
    }

    public int getQuantityToppings() {
        return quantityToppings;
    }

    public void setQuantityToppings(int quantityToppings) {
        this.quantityToppings = quantityToppings;
    }
    public int calCost(){
        if(getSize().equals("large")){
            return (14+ 2*(getQuantityCheese()+getQuantityToppings()+getQuantityPepperoni()));
        }
        if(getSize().equals("medium")){
            return (12+ 2*(getQuantityCheese()+getQuantityToppings()+getQuantityPepperoni()));
        }
        if(getSize().equals("small")){
            return (11+ 2*(getQuantityCheese()+getQuantityToppings()+getQuantityPepperoni()));
        }
        return 0;
    }
}
