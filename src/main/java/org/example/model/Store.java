package org.example.model;

public class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale [] products = new ProductForSale[] {new Bread("Test", 10, "Bread", true), new Chocolate("Test", 10, "Chocolate", true), new Coke("Test", 10, "Coke", true)};
        listProducts(products);
    }
}