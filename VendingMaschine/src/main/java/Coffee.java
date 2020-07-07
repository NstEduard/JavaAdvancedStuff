public class Coffee extends Product {
    public String hasCaffeine;

    public Coffee(String name, int quantity, int price, String hasCaffeine) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.hasCaffeine = hasCaffeine;
    }

    public Coffee() {
    }

    public String toString() {
        return name + " " + hasCaffeine + " " + price + " ron " + " " + quantity + " pieces ";
    }
}
