package OOPS;

/*
 * Write a Java program to create a class called "Circle" with a radius attribute.
 * You can access and modify this attribute.
 * Calculate the area and circumference of the circle.
 * */

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return Math.round(3.14 * radius * radius);
    }

    public double getCircumference() {
        return Math.round(2 * 3.14 * radius);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Circle C = new Circle(10.0);


        System.out.println("The area of the circle is : " + C.getArea());


        System.out.println("The circumference of the circle is: " + C.getCircumference());

        C.setRadius(20.0);

        System.out.println();
        System.out.println("The updated area and circumference is ");

        System.out.println("The area of the circle is : " + C.getArea());

        System.out.println("The circumference of the circle is: " + C.getCircumference());
    }
}
