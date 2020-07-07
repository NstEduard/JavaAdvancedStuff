public class Drinks extends Product {
    String isDiet;

    public Drinks(String name, int quantity, int price, String isDiet) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.isDiet = isDiet;
    }

    public Drinks() {
    }



    public String toString() {
        return name + " " + isDiet + " " + price + " ron " + " " + quantity + " pieces ";
    }
}
