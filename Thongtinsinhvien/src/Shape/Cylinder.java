package Shape;

public class Cylinder extends Circle {
    private double height;
    public  Cylinder(){
        super(); // gọi hàm constructor của lớp cha
        height =1.0;
    }
    public  Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        super(radius);  // call superclass constructor Circle(r)
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder
    //  use superclass method getArea() to get the base area
    public double getVolume() {
        return getArea()*height; //có thể gọi luôn phương thức của lớp cha
    }


}
