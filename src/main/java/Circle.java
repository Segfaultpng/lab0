public class Circle extends Shape {

    private double radius;
    public Circle(String name) {
        super(name);
    }

    public void setDimensions(double radius){

        this.radius = radius;
    }

    @Override
    public void printDimensions() {
        System.out.println("Radius: "+ radius);
    }

    @Override
    public double getArea() {
        return Math.pow((Math.PI*radius),2);
    }
}
