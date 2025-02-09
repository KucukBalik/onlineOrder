package ie.atu.onlineorders;

import java.awt.*;
import java.util.ArrayList;

public class OnlineOrderSystem {

    public static void main(String[] args) {

        ArrayList<MenuItems> items = new ArrayList<>();

        items.add(new Burgers("CheeseBurger", 5.99, "Cheese, Ketchup"));
        items.add(new Pizza("Pepperoni Pizza", 8.99, "Pepperoni, Cheese, Tomato Sauce"));
        items.add(new Salad("Caesar Salad", 6.49, "Lettuce, Croutons, Caesar Dressing"));

        for (MenuItems item : items) {
            System.out.println("Name: " + item.getName());
            System.out.println("Price: " + item.getPrice());
            System.out.println("Description: " + item.getDescription());
        }

        double totalPrice = 0;

        for (MenuItems item : items) {
            totalPrice += item.getPrice();
        }

        System.out.println("Total price: " + totalPrice);

    }
}
