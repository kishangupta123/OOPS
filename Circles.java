package OOPS;

public class Circles extends Shape{
    private  double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {


        return (Math.PI * radius * radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
