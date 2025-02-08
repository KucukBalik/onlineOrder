package ie.atu.onlineorders;

class Pizza implements MenuItems {

    private String name;
    private double price;
    private String ingredients;

    public Pizza(String name, double price, String ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return ingredients;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
