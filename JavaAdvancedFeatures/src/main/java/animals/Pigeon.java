package animals;

public class Pigeon extends Animals implements Herbivore,Domestic {
    @Override
    public String move() {
        return "The pigeon flies";
    }

    @Override
    public String eat() {
        return "Eats weed";
    }

    @Override
    public boolean pet() {
        return true;
    }
}
