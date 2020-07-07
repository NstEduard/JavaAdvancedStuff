package shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        // apelam metodele

        System.out.println(circle.draw());
        System.out.println(square.draw());
        System.out.println(rectangle.draw());

        System.out.println("----------");

        Shape circleTwo = new Circle();
        Shape squareTwo = new Square();
        Shape rectangleTwo = new Rectangle();

        System.out.println(circleTwo.draw());
        System.out.println(squareTwo.draw());
        System.out.println(rectangleTwo.draw());

        System.out.println("----------");

        System.out.println(circle.aria());
        System.out.println(circle.perimeter());
        System.out.println();

    }
}
