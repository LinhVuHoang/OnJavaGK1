package Polymorphism;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
    public double getArea() {
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;   // Need a return to compile the program
    }
}
