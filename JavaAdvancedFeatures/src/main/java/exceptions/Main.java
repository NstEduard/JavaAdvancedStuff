package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws OddNumberException, WovelException {
        int x = 13;
        int y = 0;

        try {
            System.out.println("Rezultatul impartirii lui x la y este: " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("Incercati o operatie aritmetica imposibila " + e.getMessage());
        }

        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println("Valoarea de pe pozitia 3 este " + numbers[3]);
            System.out.println("Valoarea de pe pozitia 16 este " + numbers[16]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A aparut o exceptie " + e.getMessage());
        }

        String text = " ";
        if (text == null) {
            throw new NullPointerException("Uitat sa instantiezi textul");
        }
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Nu ati initializat obiectul " + e.getMessage());
        }
        String text2 = "Tratam exceptii";
        System.out.println("Caracterul dela pozitia 8 este " + printChar(text2));
        String text3 = "Tratam";


        try {
            System.out.println("Caracterul dela pozitia 8 este " + printChar(text3));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Stringul este mai mic decat pozitia cautata " + e.getMessage());
        }

        /*try {
            numar();
        }catch (OddNumberException e){
            System.out.println("Avei grija ce numar introduceti " + e.getMessage());
        }*/
        // introducem un text de la tastaura
        //daca cuvantul incepe cu o vocala  aruncam exceptia si porindem VowelException
        // daca incepe cu o consoana afisa mesajul: Totul ook

        try{
            cuvant();
        }catch (WovelException e){
            System.out.println("Apare o exceptie");
        }

    }

    public static char printChar(String text) throws StringIndexOutOfBoundsException {
        return text.charAt(8);
    }

    public static  void numar() throws OddNumberException {

        System.out.println("Va rog introduceti un numar de la tastaura");
        Scanner input = new Scanner(System.in);
        int numar = input.nextInt();
        System.out.println("Ati ales numarul " + numar);

        if(numar%2 == 0 ){
            System.out.println("Ati ales un numar par");
        }else {
            throw new OddNumberException("Ai ales un numar impar");
        }
    }

    public static void cuvant() throws WovelException{
        System.out.println(" Va rog introduceti un cuvant de la tastaura");
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        System.out.println("Ati introdus cuvantul " + word);
        if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o")
                || word.startsWith("u")){
                    throw new WovelException("Cuvantul incepe cu o vocala");
        }else{
            System.out.println("Totul este ok");
        }
    }
}
