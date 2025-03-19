package GTMBatch50;

import java.util.Random;

public class CircleArea {
    public static void main(String[] args) {
        Random r = new Random();
        final double PI = 3.141592653589793;

     for (int radius = 0; radius < 5; radius++) {
      
            double area = PI * radius * radius;
            double circumference = 2 * PI * radius;
            System.out.println("Radius " + radius + ":");
            System.out.println("Area: " + area);
            System.out.println("Circumference: " + circumference);
            
        }
    }
}
