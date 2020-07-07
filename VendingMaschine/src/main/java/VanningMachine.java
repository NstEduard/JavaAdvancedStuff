import java.util.Scanner;

public class VanningMachine {
    private Cola cola;
    private Fanta fanta;
    private Watter watter;
    private Cappuccino cappuccino;
    private American american;
    private Espresso espresso;
    private Chips chips;
    private Croissant croissant;
    private Chocolate chocolate;

    private VanningMachine() {

    }

    private static final VanningMachine instance = new VanningMachine();

    public static VanningMachine getVanningMachine() {
        return instance;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }

    public void setFanta(Fanta fanta) {
        this.fanta = fanta;
    }

    public void setWatter(Watter watter) {
        this.watter = watter;
    }

    public void setCappuccino(Cappuccino cappuccino) {
        this.cappuccino = cappuccino;
    }

    public void setAmerican(American american) {
        this.american = american;
    }

    public void setEspresso(Espresso espresso) {
        this.espresso = espresso;
    }

    public void setChips(Chips chips) {
        this.chips = chips;
    }

    public void setCroissant(Croissant croissant) {
        this.croissant = croissant;
    }

    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    public Cola getCola() {
        return cola;
    }

    public Fanta getFanta() {
        return fanta;
    }

    public Watter getWatter() {
        return watter;
    }

    public Cappuccino getCappuccino() {
        return cappuccino;
    }

    public American getAmerican() {
        return american;
    }

    public Espresso getEspresso() {
        return espresso;
    }

    public Chips getChips() {
        return chips;
    }

    public Croissant getCroissant() {
        return croissant;
    }

    public Chocolate getChocolate() {
        return chocolate;
    }

    public void productsQuantity(){
        System.out.println("Cola quantity is " + instance.getCola().getQuantity());
        System.out.println("Fanta quantity is " + instance.getFanta().getQuantity());
        System.out.println("Watter quantity is " + instance.getWatter().getQuantity());
        System.out.println("Cappuccino quantity is " + instance.getCappuccino().getQuantity());
        System.out.println("Espresso quantity is " + instance.getEspresso().getQuantity());
        System.out.println("American quantity is " + instance.getAmerican().getQuantity());
        System.out.println("Chocolate quantity is " + instance.getChocolate().getQuantity());
        System.out.println("Chips quantity is " + instance.getChips().getQuantity());
        System.out.println("Croissant quantity is " + instance.getCroissant().getQuantity());
    }

    public void getMenu(){
        System.out.println("Main menu");
        System.out.println("For coffee menu press 1");
        System.out.println("For drinks menu  press 2");
        System.out.println("for snack menu press 3");
    }
}
