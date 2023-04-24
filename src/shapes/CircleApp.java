package shapes;

import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input1 = new Input();
        System.out.println("Please enter the radius");
        Circle circle1 = new Circle(input1.getDouble());
        System.out.printf("Circle area: %f; Circle Circumference : %f. %n", circle1.getArea(), circle1.getCircumference());

    }
}
