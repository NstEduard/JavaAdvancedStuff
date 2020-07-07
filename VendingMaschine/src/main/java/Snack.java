public class Snack extends Product {
    String taste;
    public Snack(String name, int quantity, int price, String taste) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.taste = taste;
    }

    public Snack() {

    }

    public String toString() {
        return name + " " + taste + " " + price + " ron " + " " + quantity + " pieces ";
    }
}
