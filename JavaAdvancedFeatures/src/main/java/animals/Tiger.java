package animals;

public class Tiger extends Animals implements Carnivore,Wild {
    @Override
    public String move() {
        return "The tiger runs";
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
