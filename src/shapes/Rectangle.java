package shapes;

public class Rectangle {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public int getPerimeter(){
        return ( 2* this.width)+( 2 * this.height);
    }
}
