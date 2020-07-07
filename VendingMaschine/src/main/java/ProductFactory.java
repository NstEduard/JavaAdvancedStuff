public class ProductFactory {

    public ProductFactory() {

    }


    public Product getDrink(String name) {
        if (name.equalsIgnoreCase("Cola")) {
            return new Cola();
        } else if (name.equalsIgnoreCase("Fanta")) {
            return new Fanta();
        } else if (name.equalsIgnoreCase("Watter")) {
            return new Watter();
        } else System.out.println("No such drink");
        return null;
    }

    public Product getCoffee(String name) {
        if (name.equalsIgnoreCase("Espresso")) {
            return new Espresso();
        } else if (name.equalsIgnoreCase("Cappuccino")) {
            return new Cappuccino();
        } else if (name.equalsIgnoreCase("American")) {
            return new American();
        } else System.out.println("No such coffee");
        return null;
    }

    public Product getSnack(String name) {
        if (name.equalsIgnoreCase("Chips")) {
            return new Chips();
        } else if (name.equalsIgnoreCase("Croissant")) {
            return new Croissant();
        } else if (name.equalsIgnoreCase("Chocolate")) {
            return new Chocolate();
        } else System.out.println("No such snack");
        return null;
    }
}
