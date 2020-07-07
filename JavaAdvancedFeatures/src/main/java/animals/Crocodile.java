package animals;

public class Crocodile extends Animals implements Carnivore,Wild {

    @Override
    public String move() {
        return "The crocodile swims";
    }

    @Override
    public String eat() {
        return "Eats meat";
    }

    @Override
    public boolean pet() {
        return false;
    }
}
