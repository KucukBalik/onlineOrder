package ie.atu.onlineorders;

import java.awt.*;
import java.util.ArrayList;

public class OnlineOrderSystem {

    public static void main(String[] args) {

        ArrayList<MenuItems> items = new ArrayList<>();

        items.add(new Burgers("CheeseBurger", 5.99, "Cheese, Ketchup"));
        items.add(new Pizza("Pepperoni Pizza", 8.99, "Pepperoni, Cheese, Tomato Sauce"));
        items.add(new Salad("Caesar Salad", 6.49, "Lettuce, Croutons, Caesar Dressing"));

        items.add(new Burgers("SmokyBurger", 5.99, "Smoked Cheese, Onion, Pickle"));
        items.add(new Pizza("Chicken Pizza", 8.99, "Chicken, Mozarella, Tomato Sauce"));
        items.add(new Salad("Chicken Salad", 6.49, "Lettuce, Chicken, Spices"));

        for (MenuItems item : items) {
            System.out.println("Name: " + item.getName());
            System.out.println("Price: " + item.getPrice());
            System.out.println("Description: " + item.getDescription() + "\n");
        }

        double totalPrice = 0;

        for (MenuItems item : items) {
            totalPrice += item.getPrice();
        }

        System.out.println(String.format("Total price is: %.2f", totalPrice));

    }
}
