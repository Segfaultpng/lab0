import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        ArrayList<Shape> shapes = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to shape builder");
        System.out.println("Please enter a name for your square");

        Square square = new Square(scanner.next());
        System.out.println("Please enter the length and height of your square");
        square.setDimensions(scanner.nextDouble(),scanner.nextDouble());

        //add to array
        shapes.add(square);

        System.out.println("Please enter a name for your circle");

        Circle circle = new Circle(scanner.next());
        System.out.println("Please enter the radius of your square");
        circle.setDimensions(scanner.nextDouble());

        //add to array
        shapes.add(circle);

        System.out.println("Please enter a name for your triangle");

        Triangle triangle = new Triangle(scanner.next());
        System.out.println("Please enter the side lengths of your triangle");
        triangle.setDimensions(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());

        //add to array
        shapes.add(triangle);

        System.out.println("Please enter a name for your equilateral triangle");

        EquilateralTriangle etriangle = new EquilateralTriangle(scanner.next());
        System.out.println("Please enter the side length of your etriangle");
        etriangle.setDimensions(scanner.nextDouble());

        //add to array
        shapes.add(etriangle);

        for (Shape s: shapes) {
            System.out.println(s.getName());
            s.printDimensions();
            System.out.println(s.getArea());
        }

    }
}
