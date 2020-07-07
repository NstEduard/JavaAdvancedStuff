package shapes;

public class Circle extends Shape implements Calculable{
    public String draw() {
        return "I draw a circle";
    }

    @Override
    public String perimeter() {
        return "Se calculeaza perimetrul cercului";
    }

    @Override
    public String aria() {
        return "Se calculeaza aria cercului";
    }
}
