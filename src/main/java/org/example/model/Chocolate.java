package org.example.model;

public class Chocolate extends ProductForSale {
    private boolean hasMilk;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, boolean hasMilk) {
        super(type, price, description);
        this.hasMilk = hasMilk;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Has Milk: " + hasMilk);
    }
}
