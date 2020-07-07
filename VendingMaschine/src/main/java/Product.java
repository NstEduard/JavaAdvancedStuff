public abstract class Product {
    String name;
    int quantity;
    int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int sellProduct(int quantityPurchased){
        return price*quantityPurchased;
    }
}
