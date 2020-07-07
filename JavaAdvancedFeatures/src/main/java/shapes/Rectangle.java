package shapes;

public class Rectangle extends Shape implements Calculable {
    public String draw() {
        return "I draw a rectangle";
    }

    @Override
    public String perimeter() {
        return "Se calculeaza perimetrul dreprunghilui";
    }

    @Override
    public String aria() {
        return "Se calculeaza aria dereptunghiului";
    }
}
