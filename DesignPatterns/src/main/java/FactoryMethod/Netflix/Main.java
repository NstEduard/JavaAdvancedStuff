package FactoryMethod.Netflix;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Alege o optiune!");
        System.out.println("For Standard press 1 ");
        System.out.println("For Business press 2");
        System.out.println("For Premium press 3");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        SubscriptionFactory  subscriptionFactory = new SubscriptionFactory();
        if(option == 1){
           Standard standardSub = (Standard) subscriptionFactory.getSubscription("Standard");
            System.out.println("Optiunea aleasa este Standard");
            System.out.println("Pretul este " + standardSub.getPrice());
        }else if(option == 2){
            Business standardSub = (Business) subscriptionFactory.getSubscription("Business");
            System.out.println("Optiunea aleasa este Business" );
            System.out.println("Pretul este " + standardSub.getPrice());
        }else if(option == 3){
            Premium standardSub = (Premium) subscriptionFactory.getSubscription("Premium");
            System.out.println("Optiunea aleasa este Premium" );
            System.out.println("Pretul este " + standardSub.getPrice());
        }else {
            System.out.println("Optiunea nu exista");
        }



    }
}
