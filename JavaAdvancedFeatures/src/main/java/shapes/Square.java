package shapes;

public class Square extends Shape implements Calculable{
    public String draw() {
        return "I draw a square";
    }

    @Override
    public String perimeter() {
        return "Se calculeaza perimetru patratului";
    }

    @Override
    public String aria() {
        return "Se calculeaza aria dreptunghiului";
    }
}
