/*
* @author Tadisa Jakarasi
* @date 30/07/2024
* Week 9- Lab Task
 */


public class Circle {
    private double radius;
    public static final double PI = 3.1416;

    public Circle(double radiusIn) //constructor method
    {
        radius = radiusIn; // copying radius value into permanent radius attribute
    }
    public double getRadius() // method to get the radius value
    {
        return radius;
    }

    public void setRadius(double radiusIn) //method to change the radius value
    {
        radius = radiusIn;
    }

    public double calculateArea() //method to calculate the area of the circle
    {
        return PI * (radius*radius);
    }

    public double calculateCircumference() // method to calculate the circumference
    {
        return 2*PI*radius;
    }

}
