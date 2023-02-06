
import java.util.Scanner;

public class Shape {
    double radius;
    Shape(double radius){
    this.radius = radius;
    }
}
    class Circle extends Shape{
        double area = ((22/7)*radius*radius);
        Circle (double radius)
        {
            super(radius);
    }
    void areaCalculation(){
        System.out.println("Area of circle is: " + area);
    }
}



