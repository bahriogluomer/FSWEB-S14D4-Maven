package org.example.model;

public class Bread extends ProductForSale {
    private boolean isGlutenFree;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }
    public Bread(String type, double price, String description, boolean isGlutenFree) {
        super(type, price, description);
        this.isGlutenFree = isGlutenFree;
    }


        @Override
        public void showDetails() {
            System.out.println("Type: " + getType());
            System.out.println("Price: " + getPrice());
            System.out.println("Description: " + getDescription());
            System.out.println("Is Gluten Free: " + isGlutenFree);
        }

}
