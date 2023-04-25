package shapes;

class Square extends Rectangle {

    public int side;

    public double getArea(){
        return Math.pow(this.side,2);
    }

    public int getPerimeter(){
        return 4 * this.side ;
    }
    public Square(int side){
        super(side,side);
        this.side=side;

    }
}
