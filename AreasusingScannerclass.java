package GTMBatch50;
import java.util.Scanner;
public class AreasusingScannerclass {
public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in); 
        int side, area, perimeter, breadth, height, Triperi,a,b,c,length,width,recarea,recperi,radius;
        float Triarea;
        double pi = 3.14,Circlearea,Circumfofcircle;
       System.out.println("Enter the side of a square:");
        side = s1.nextInt();  
        area = side * side;  
        perimeter = 4 * side;  
        System.out.println("Area of Square is: " + area);
        System.out.println("Perimeter of Square is: " + perimeter);
        System.out.println("Enter the length of rectangle:");
        length = s1.nextInt();
        System.out.println("Enter the width of a rectangle:");
        width= s1.nextInt();
        recarea = length* width;
        System.out.println("Area of rectangle is: "+ recarea);
        recperi= 2*(length+ width);
        System.out.println("Perimeter of rectangle is : "+ recperi);
        System.out.println("Please enter the breadth of the triangle:");
        breadth = s1.nextInt(); 
        System.out.println("Please enter the height of the triangle:");
        height = s1.nextInt(); 
        Triarea = (breadth * height) / 2f;
        System.out.println("Area of Triangle is: " + Triarea);
        System.out.println("Please enter the value of a:");
        a = s1.nextInt(); 
        System.out.println("Please enter the value of b:");
        b = s1.nextInt(); 
        System.out.println("Please enter the value of c:");
        c = s1.nextInt(); 
        Triperi = a+b+c;
        System.out.println("Triangle perimeter is: " + Triperi);
        System.out.println("Please enter the radius of circle :");
        radius = s1.nextInt();
        Circlearea= pi*radius*radius;
        System.out.println("Area of circle is: " + Circlearea);
        Circumfofcircle = 2*pi*radius;
        System.out.println("Circumference of circle is: " + Circumfofcircle );
        s1.close();
    }
}
