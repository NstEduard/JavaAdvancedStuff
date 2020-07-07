package animals;

public class Main {
    public static void main(String[] args) {

        Animals pigeon = new Pigeon();
        Animals crocodile = new Crocodile();
        Animals tiger = new Tiger();
        Animals reptile = new Reptile();

        Pigeon pigeon1 = new Pigeon();
        Crocodile crocodile1 = new Crocodile();
        Tiger tiger1 = new Tiger();
        Reptile reptile1 = new Reptile();


        System.out.println(pigeon.move());
        System.out.println(crocodile.move());
        System.out.println(tiger.move());
        System.out.println(reptile.move());

        System.out.println("----------");

        System.out.println(pigeon.sleep());
        System.out.println(crocodile.sleep());
        System.out.println(tiger.sleep());
        System.out.println(reptile.sleep());

        System.out.println("----------");

        System.out.println(pigeon1.move());
        System.out.println(crocodile1.move());
        System.out.println(tiger1.move());
        System.out.println(reptile1.move());

        System.out.println("------------");

        System.out.println(pigeon1.sleep());
        System.out.println(crocodile1.sleep());
        System.out.println(tiger1.sleep());
        System.out.println(reptile1.sleep());

        System.out.println(reptile1.eat());
        System.out.println(crocodile1.eat());
        System.out.println(tiger1.eat());
        System.out.println(pigeon1);

        Domestic pigeon3 = new Pigeon();

    }
}
