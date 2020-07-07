import java.io.*;
import java.util.Scanner;

public class Main {
    /**
     * Modelam un automat de Vending Machine care o sa poata vinde:
     * - bauturi (Cola, Fanta, apa) cu nume, pret si cantitate (despartite prin ";")
     * - cafea - cu nume, pret si cantitate; putem vinde Cappucino, Americano, Espresso
     * - snack-uri - cu nume, pret si cantitate: croassant, chips, chocolate bar
     * Fiecare din aceste categorii vor fi citite din fisier (3 fisiere - bauturi, cafea, snack-uri)
     * Vom implementa un meniu:
     * - optiunea 1: Introduceti o suma de bani; utilizatorul va introduce un numar; trebuie sa ne asiguram ca numarul > 0,
     * daca nu se arunca o exceptie AmountNotAcceptedException
     * - apoi se afiseaza optiunile de cumparare: tasta 1 - cola, tasta 2 - fanta, tasta 3 - apa, tasta 4 - Cappucino,
     * tasta 5 - Americano, tasta 6 - Espreso, tasta 7 - croassant, tasta 8 - chips, tasta 9 - chocolate bar
     * Dupa ce user-ul selecteaza ce vrea, daca are destui bani ii vinde ce vrea, daca nu aruncam o exceptie NotEnoughMoneyException.
     * Trebuie sa verificam daca exista cantitatea solicitata, daca nu se arunca exceptia NotEnoughQuantityException.
     */
    public static void main(String[] args) throws AmountNotAcceptedException {
        VanningMachine vanningMachine = VanningMachine.getVanningMachine();
        String coffeeFilePath = "E:\\JavaCursuriSDAcademy\\VendingMaschine\\src\\main\\java\\ProductFiles\\CofeeFile";
        String drinksFilePath = "E:\\JavaCursuriSDAcademy\\VendingMaschine\\src\\main\\java\\ProductFiles\\DrinksFile";
        String snackFilePath = "E:\\JavaCursuriSDAcademy\\VendingMaschine\\src\\main\\java\\ProductFiles\\SnackFile";

        try {
            FileReader coffeeReader = new FileReader(coffeeFilePath);
            BufferedReader bufferedReaderCoffee = new BufferedReader(coffeeReader);
            String coffeeText = bufferedReaderCoffee.readLine();

            while (coffeeText != null && !coffeeText.isEmpty()) {
                String[] words = coffeeText.split(";");
                if (words[0].equalsIgnoreCase("cappuccino")) {
                    Cappuccino cappuccino = new Cappuccino(words[0], Integer.parseInt(words[1]), Integer.valueOf(words[2]), words[3]);
                    vanningMachine.setCappuccino(cappuccino);
                } else if (words[0].equalsIgnoreCase("american")) {
                    American american = new American(words[0], Integer.parseInt(words[1]), Integer.valueOf(words[2]), words[3]);
                    vanningMachine.setAmerican(american);
                } else if (words[0].equalsIgnoreCase("espresso")) {
                    Espresso espresso = new Espresso(words[0], Integer.parseInt(words[1]), Integer.valueOf(words[2]), words[3]);
                    vanningMachine.setEspresso(espresso);
                }

                coffeeText = bufferedReaderCoffee.readLine();
            }

            FileReader drinkReader = new FileReader(drinksFilePath);
            BufferedReader bufferedReaderDrink = new BufferedReader(drinkReader);
            String drinkText = bufferedReaderDrink.readLine();
            while (drinkText != null && !drinkText.isEmpty()) {
                String[] words = drinkText.split(";");
                if (words[0].equalsIgnoreCase("cola")) {
                    Cola cola = new Cola(words[0], Integer.parseInt(words[1]), Integer.valueOf(words[2]), words[3]);
                    vanningMachine.setCola(cola);
                } else if (words[0].equalsIgnoreCase("fanta")) {
                    Fanta fanta = new Fanta(words[0], Integer.parseInt(words[1]), Integer.valueOf(words[2]), words[3]);
                    vanningMachine.setFanta(fanta);
                } else if (words[0].equalsIgnoreCase("watter")) {
                    Watter watter = new Watter(words[0], Integer.parseInt(words[1]), Integer.valueOf(words[2]), words[3]);
                    vanningMachine.setWatter(watter);
                }
                drinkText = bufferedReaderDrink.readLine();
            }

            FileReader fileReaderSnack = new FileReader(snackFilePath);
            BufferedReader bufferedReaderSnack = new BufferedReader(fileReaderSnack);
            String textSnack = bufferedReaderSnack.readLine();
            while (textSnack != null && !textSnack.isEmpty()) {
                String[] words = textSnack.split(";");
                if (words[0].equalsIgnoreCase("croissant")) {
                    Croissant croissant = new Croissant(words[0], Integer.parseInt(words[1]), Integer.valueOf(words[2]), words[3]);
                    vanningMachine.setCroissant(croissant);
                } else if (words[0].equalsIgnoreCase("chips")) {
                    Chips chips = new Chips(words[0], Integer.parseInt(words[1]), Integer.valueOf(words[2]), words[3]);
                    vanningMachine.setChips(chips);
                } else if (words[0].equalsIgnoreCase("chocolate")) {
                    Chocolate chocolate = new Chocolate(words[0], Integer.parseInt(words[1]), Integer.valueOf(words[2]), words[3]);
                    vanningMachine.setChocolate(chocolate);
                }
                textSnack = bufferedReaderSnack.readLine();
            }

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the amount");
            int amount = input.nextInt();
            if (amount == 0) {
                throw new AmountNotAcceptedException("Invalid amount");
            } else System.out.println("You have " + amount + " ron credit");
            int grandTotal = 0;
            do {
                vanningMachine.getMenu();
                int option = input.nextInt();
                if (option == 1) {
                    System.out.println("For Cappuccino press 1 " + "(" + vanningMachine.getCappuccino().getQuantity() + " pieces available)");
                    System.out.println("For Espresso press 2 " + "(" + vanningMachine.getEspresso().getQuantity() + " pieces available)");
                    System.out.println("For American press 3 " + "(" + vanningMachine.getAmerican().getQuantity() + " pieces available)");
                    option = input.nextInt();
                    if (option == 1) {
                        System.out.println("Please enter the quantity");
                        int productQuantity = input.nextInt();
                        if(productQuantity > vanningMachine.getCappuccino().getQuantity()){
                           throw  new NotEnoughQuantityException("No enough quantity");
                        }
                        System.out.println("You purchased " + productQuantity + " " + vanningMachine.getCappuccino().name + " at " + vanningMachine.getCappuccino().price + " ron each");
                        System.out.println("Total " + vanningMachine.getCappuccino().price * productQuantity + " ron");
                        grandTotal += vanningMachine.getCappuccino().sellProduct(productQuantity);
                        vanningMachine.getCappuccino().setQuantity(vanningMachine.getCappuccino().getQuantity() - productQuantity);
                        System.out.println("Do you want to continue? Y/N");
                    } else if (option == 2) {
                        System.out.println("Please enter the quantity");
                        int productQuantity = input.nextInt();
                        if(productQuantity > vanningMachine.getEspresso().getQuantity()){
                            throw  new NotEnoughQuantityException("No enough quantity");
                        }
                        System.out.println("You purchased " + productQuantity + " " + vanningMachine.getEspresso().name + " at " + vanningMachine.getEspresso().price + " ron each");
                        System.out.println("Total " + vanningMachine.getCappuccino().price * productQuantity + " ron");
                        grandTotal += vanningMachine.getEspresso().sellProduct(productQuantity);
                        vanningMachine.getEspresso().setQuantity(vanningMachine.getEspresso().getQuantity() - productQuantity);
                        System.out.println("Do you want to continue? Y/N");
                    } else if (option == 3) {
                        System.out.println("Please enter the quantity");
                        int productQuantity = input.nextInt();
                        if(productQuantity > vanningMachine.getAmerican().getQuantity()){
                            throw  new NotEnoughQuantityException("No enough quantity");
                        }
                        System.out.println("You purchased " + productQuantity + " " + vanningMachine.getAmerican().name + " at " + vanningMachine.getAmerican().price + " ron each");
                        System.out.println("Total " + vanningMachine.getAmerican().price * productQuantity + " ron");
                        grandTotal += vanningMachine.getAmerican().sellProduct(productQuantity);
                        vanningMachine.getAmerican().setQuantity(vanningMachine.getAmerican().getQuantity() - productQuantity);
                        System.out.println("Do you want to continue? Y/N");
                    }
                } else if (option == 2) {
                    System.out.println("For Coca Cola press 1 " + "(" + vanningMachine.getCola().getQuantity() + " pieces available)");
                    System.out.println("For Fanta press 2 " + "(" + vanningMachine.getFanta().getQuantity() + " pieces available)");
                    System.out.println("For Water press 3 " + "(" + vanningMachine.getWatter().getQuantity() + " pieces available)");
                    option = input.nextInt();
                    if (option == 1) {
                        System.out.println("Please enter the quantity");
                        int productQuantity = input.nextInt();
                        if(productQuantity > vanningMachine.getCola().getQuantity()){
                            throw  new NotEnoughQuantityException("No enough quantity");
                        }
                        System.out.println("You purchased " + productQuantity + " " + vanningMachine.getCola().name + " at " + vanningMachine.getCola().price + " ron each");
                        System.out.println("Total " + vanningMachine.getCola().price * productQuantity + " ron");
                        grandTotal += vanningMachine.getCola().sellProduct(productQuantity);
                        vanningMachine.getCola().setQuantity(vanningMachine.getCola().getQuantity() - productQuantity);
                        System.out.println("Do you whant to continue? Y/N");
                    } else if (option == 2) {
                        System.out.println("Please enter the quantity");
                        int productQuantity = input.nextInt();
                        if(productQuantity > vanningMachine.getFanta().getQuantity()){
                            throw  new NotEnoughQuantityException("No enough quantity");
                        }
                        System.out.println("You purchased " + productQuantity + " " + vanningMachine.getFanta().name + " at " + vanningMachine.getFanta().price + " ron each");
                        System.out.println("Total " + vanningMachine.getFanta().price * productQuantity + " ron");
                        grandTotal += vanningMachine.getFanta().sellProduct(productQuantity);
                        vanningMachine.getFanta().setQuantity(vanningMachine.getFanta().getQuantity() - productQuantity);
                        System.out.println("Do you whant to continue? Y/N");
                    } else if (option == 3) {
                        System.out.println("Please enter the quantity");
                        int productQuantity = input.nextInt();
                        if(productQuantity > vanningMachine.getWatter().getQuantity()){
                            throw  new NotEnoughQuantityException("No enough quantity");
                        }
                        System.out.println("You purchased " + productQuantity + " " + vanningMachine.getWatter().name + " at " + vanningMachine.getWatter().price + " ron each");
                        System.out.println("Total " + vanningMachine.getWatter().price * productQuantity + " ron");
                        grandTotal += vanningMachine.getWatter().sellProduct(productQuantity);
                        vanningMachine.getWatter().setQuantity(vanningMachine.getWatter().getQuantity() - productQuantity);
                        System.out.println("Do you whant to continue? Y/N");
                    }
                } else if (option == 3) {
                    System.out.println("For Croissant press 1 " + "(" + vanningMachine.getCroissant().getQuantity() + " pieces available)");
                    System.out.println("For Chips press 2 " + "(" + vanningMachine.getChips().getQuantity() + " pieces available)");
                    System.out.println("For Chocolate press 3 " + "(" + vanningMachine.getChocolate().getQuantity() + " pieces available)");
                    option = input.nextInt();
                    if (option == 1) {
                        System.out.println("Please enter the quantity");
                        int productQuantity = input.nextInt();
                        if(productQuantity > vanningMachine.getCroissant().getQuantity()){
                            throw  new NotEnoughQuantityException("No enough quantity");
                        }
                        System.out.println("You purchased " + productQuantity + " " + vanningMachine.getCroissant().name + " at " + vanningMachine.getCroissant().price + " ron each");
                        System.out.println("Total " + vanningMachine.getWatter().price * productQuantity + " ron");
                        grandTotal += vanningMachine.getCroissant().sellProduct(productQuantity);
                        vanningMachine.getCroissant().setQuantity(vanningMachine.getCroissant().getQuantity() - productQuantity);
                        System.out.println("Do you whant to continue? Y/N");
                    } else if (option == 2) {
                        System.out.println("Please enter the quantity");
                        int productQuantity = input.nextInt();
                        if(productQuantity > vanningMachine.getChips().getQuantity()){
                            throw  new NotEnoughQuantityException("No enough quantity");
                        }
                        System.out.println("You purchased " + productQuantity + " " + vanningMachine.getChips().name + " at " + vanningMachine.getChips().price + " ron each");
                        System.out.println("Total " + vanningMachine.getChips().price * productQuantity + " ron");
                        grandTotal += vanningMachine.getChips().sellProduct(productQuantity);
                        vanningMachine.getChips().setQuantity(vanningMachine.getChips().getQuantity() - productQuantity);
                        System.out.println("Do you whant to continue? Y/N");
                    } else if (option == 3) {
                        System.out.println("Please enter the quantity");
                        int productQuantity = input.nextInt();
                        if(productQuantity > vanningMachine.getChocolate().getQuantity()){
                            throw  new NotEnoughQuantityException("No enough quantity");
                        }
                        System.out.println("You purchased " + productQuantity + " " + vanningMachine.getChocolate().name + " at " + vanningMachine.getChocolate().price + " ron each");
                        System.out.println("Total " + vanningMachine.getChocolate().price * productQuantity + " ron");
                        grandTotal += vanningMachine.getChocolate().sellProduct(productQuantity);
                        vanningMachine.getChocolate().setQuantity(vanningMachine.getChocolate().getQuantity() - productQuantity);
                        System.out.println("Do you whant to continue? Y/N");
                    }
                }
            } while (input.next().equalsIgnoreCase("y"));

            System.out.println("Total " + grandTotal);
            if (amount < grandTotal) {
                throw new NotEnoughMoneyException("No enough money");
            } else
                System.out.println("Change " + (amount - grandTotal));
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }catch (AmountNotAcceptedException exception){
            exception.printStackTrace();
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        } catch (NotEnoughQuantityException e) {
            e.printStackTrace();
        }
    }
}
