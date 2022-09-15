package Abstract;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 0.5*radius;
    }

    @Override
    double getPerimeter() {
        return radius*1000;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
