package PointInRectangle;

public class Rectangle {

    private Point A;
    private Point C;

    public Rectangle(Point a, Point c) {
        this.A = a;
        this.C = c;
    }

    public boolean contains(Point x){
        return x.greaterOrEqual(A) && x.lessOrEqual(C);
    }

}
