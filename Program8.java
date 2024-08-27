package OOPS;
/*
* Write a Java program to create class called "TrafficLight"
* with attributes for color and duration, and
* methods to change the color and check for red or green.
* */

class TrafficLight{
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor){
        color = newColor;
    }
    public  boolean isRed(){
        return  color.equals("red");
    }

    public  boolean isYellow(){
        return  color.equals("yellow");
    }

    public  boolean isGreen(){
        return  color.equals("green");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
public class Program8 {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red", 30);

        System.out.println("The light is red : " + light.isRed());
        System.out.println("The light is yellow : " + light.isYellow());
        System.out.println("The light is green : " + light.isGreen());
        System.out.println("The light duration is : " + light.getDuration() +  "\n");

        light.changeColor("yellow");
        System.out.println("The light is now yellow : " + light.isYellow());

        light.setDuration(20);
        System.out.println("The light duration is : " + light.getDuration() + "\n");

        light.changeColor("green");

        System.out.println("The light is now green : " + light.isGreen());

        System.out.println("The light duration is : " + light.getDuration() + "\n");

        light.setDuration(30);

        System.out.println("The light duration is now changed to : " + light.getDuration());
    }
}
