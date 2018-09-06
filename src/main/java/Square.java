public class Square extends Shape {

    private double length,height;

    public Square(String name) {
        super(name);
    }

    public void setDimensions(double length,double height){
        this.length = length;
        this.height = height;

    }

    @Override
    public void printDimensions() {
        System.out.println("Length: " + length + "\t" + "height: "+ height);
    }

    @Override
    public double getArea() {
        return (length * height);
    }
}
