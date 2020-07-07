package Singleton.StudentsClass.Restaurant;
// exemplification DesignPattern-ul Singleton
public class Main {
    public static void main(String[] args) {
        Menu menu = Menu.getInstance();
        Menu menu2 = Menu.getInstance();
        System.out.println(menu.getDrinks());
        System.out.println(menu2.getDrinks());

        // daca modifican parametrul unul obiect, se modifica ptr toate
        menu.setDrinks("Fanta");
        System.out.println(menu.getDrinks());
        System.out.println(menu2.getDrinks());



    }
}
