package shapes;

public class ShapeTest {
    Measurable myShape;


    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5,10);

        Measurable yourShape  = new Square(6);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        System.out.println(yourShape.getPerimeter());
        System.out.println(yourShape.getArea());

    }
}
