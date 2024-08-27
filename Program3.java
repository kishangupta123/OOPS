package OOPS;

/*
 * Write a Java program to create a class called "Rectangle" with width and height attributes.
 * Calculate the area and perimeter of the rectangle.
 * */

class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

public class Program3 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4.0, 5.0);

        double area = rect1.width * rect1.getHeight();
        System.out.println("the area of the rectangle is: " + area);
        double perimeter = 2 * (rect1.width + rect1.height);
        System.out.println("the perimeter of the rectangle is : " + perimeter);
    }
}
