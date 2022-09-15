package Polymorphism;

public class Tritangle extends Shape {
    private  int base;
    private  int height;

    public Tritangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle of base=" + base + " and height=" + height + ", subclass of " + super.toString();
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}
