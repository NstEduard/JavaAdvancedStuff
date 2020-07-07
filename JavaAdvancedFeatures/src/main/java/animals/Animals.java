package animals;

public abstract class Animals {
    public abstract String move();

    public final String sleep(){
        return "This animal sleeps";
    }
}
