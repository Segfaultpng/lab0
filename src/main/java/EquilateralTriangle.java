public class EquilateralTriangle extends Triangle {


    public EquilateralTriangle(String name) {
        super(name);
    }


    public void setDimensions(double side) {
        super.setDimensions(side, side, side);
    }
}
