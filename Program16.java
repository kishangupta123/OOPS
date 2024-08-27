package OOPS;

/*
* Write a Java program to create a class called "Shape"
* with abstract methods for calculating area and perimeter,
* and subclasses for "Rectangle", "Circle", and "Triangle".

Note: An abstract class is a class that is declared abstract—
* it may or may not include abstract methods.
* Abstract classes cannot be instantiated, but they can be subclassed.

An abstract method is a method that is declared without an
* implementation (without braces, and followed by a semicolon).
* */

abstract  class Shape{
    public abstract double getArea();

    public  abstract double getPerimeter();
}
public class Program16 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangles(10, 12);

        Shape circle = new Circles(5.0);

        Shape triangle = new Triangle(12, 13, 14);

        System.out.println("The area of the rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter() + "\n");

        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The perimeter of the circle is: " + circle.getPerimeter() + "\n");

        System.out.println("The area of the triangle is: " + triangle.getArea());
        System.out.println("The perimeter of the triangle is: " + triangle.getPerimeter() + "\n");
    }
}
