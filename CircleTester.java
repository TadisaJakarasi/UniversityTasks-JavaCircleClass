/*
 * @author Tadisa Jakarasi
 * @date 30/07/2024
 * Week 9- Lab Task
 */

public class CircleTester {

    public static void main(String[] args) {
        System.out.println("The value of PI: " + Circle.PI); // to print the value of PI
        Circle c1 = new Circle(4.5); //creating an object
        System.out.println("The radius value: " + c1.getRadius());
        System.out.println("The area for the circle: " + c1.calculateArea());
        System.out.println("The circumference for the circle: " + c1.calculateCircumference());
    }
}





