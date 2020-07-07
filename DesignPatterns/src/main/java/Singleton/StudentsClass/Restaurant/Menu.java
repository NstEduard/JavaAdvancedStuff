package Singleton.StudentsClass.Restaurant;

public class Menu {
    /*
    * pasul 1 - constructorul clasei trebuie sa fie privat
    * pasul 2 - se instantiava o variabila privata si statica de tipul meniu - instance(sa ne asiguram ca e una singur)
    * pasul 3 - oferim accesul catre instanta noastra printr-o metoda de tipul - get;
    *
    * */

    private static Menu instance = new Menu();
    private String drinks = "Pepsi, Cola";

    private Menu(){

    }

    public static Menu getInstance() {
        return Menu.instance;
    }

    public String getDrinks(){
        return drinks;
    }

    public void setDrinks(String drink){
        this.drinks = drink;
    }
}
