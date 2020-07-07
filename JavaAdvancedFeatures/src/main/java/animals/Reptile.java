package animals;

public class Reptile extends Animals implements Omnivore, Wild {
    @Override
    public String move() {
        return "The reptile crows";
    }

    @Override
    public String eat() {
        return "Eats like a human";
    }

    @Override
    public boolean pet() {
        return true;
    }
}
