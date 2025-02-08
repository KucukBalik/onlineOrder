package ie.atu.onlineorders;

class Burgers implements MenuItems {

    private String name;
    private double price;
    private String ingredients;

    public Burgers(String name, double price, String ingredients) {
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

    @Override
    public String toString() {
        return "Burgers{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
