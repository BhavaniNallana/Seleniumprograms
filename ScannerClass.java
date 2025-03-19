package GTMBatch50;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
        int a,b,Sum,Sub,Mul,Div;
        System.out.println("Enter a value");
        a = s1.nextInt();
        System.out.println("Enter b value");
        b = s1.nextInt();
        Sum = a+b;
        Sub = b-a;
        Mul = a*b;
        Div = b/a;
       System.out.println("Sum is" + " "+ Sum);
       System.out.println("Sub is" + " "+ Sub);
       System.out.println("Mul is" + " "+ Mul);
       System.out.println("Div is" + " "+ Div);

       s1.close();
	}

}
