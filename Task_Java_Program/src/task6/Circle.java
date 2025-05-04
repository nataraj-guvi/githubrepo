package task6;
import java.util.Scanner;

public class Circle {
    private double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle1 = new Circle();
        System.out.println("Circle 1 created with default radius: " + circle1.getRadius());
        System.out.println("Circumference of Circle 1: " + circle1.calculateCircumference());
        System.out.print("\nEnter radius for Circle 2: ");
        double userRadius = scanner.nextDouble();
        Circle circle2 = new Circle(userRadius);
        System.out.println("Circle 2 created with radius: " + circle2.getRadius());
        System.out.println("Circumference of Circle 2: " + circle2.calculateCircumference());
        System.out.print("\nEnter new radius for Circle 1: ");
        circle1.setRadius(scanner.nextDouble());
        System.out.println("Updated radius of Circle 1: " + circle1.getRadius());
        System.out.println("New circumference of Circle 1: " + circle1.calculateCircumference());
        scanner.close();
    }
}