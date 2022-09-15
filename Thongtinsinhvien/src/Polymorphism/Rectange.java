package Polymorphism;

public class Rectange extends Shape {
    private int length;
    private int width;
    public Rectange(String color) {
        super(color);
    }

    public Rectange(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectange{" +
                "length=" + length +
                ", width=" + width +", subclass of" + super.toString() +
                '}';
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
