package OOPS;

public class Rectangles extends Shape {
    private double length;
    private double width;

    public Rectangles(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return  length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length  + width);
    }
}
