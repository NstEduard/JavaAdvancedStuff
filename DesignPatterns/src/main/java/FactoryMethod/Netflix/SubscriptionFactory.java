package FactoryMethod.Netflix;

public class SubscriptionFactory {
    public Subscription getSubscription(String name){
        if(name.equals("Standard")){
            return new Standard();
        }else if(name.equals("Business")){
            return new Business();
        }else if(name.equals("Premium")){
            return new Premium();
        }else return null;
    }
}
