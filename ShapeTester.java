import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter radius:");
            double radius = scan.nextDouble();
            Circle a = new Circle(radius);
            a.areaCalculation();
    }
}
