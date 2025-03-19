package GTMBatch50;

public class NonStaticMethod {

 void subtraction()
 {
	 int a = 78;
	 int b = 98;
	 int c = b-a;
	 System.out.println("Subtraction result is" + " "+ c);
 }
 void subtraction(int a, double b)
 {
	 double c = b-a;
	 System.out.println("Subtraction result is" + " "+ c);
 }
 void subtraction(double e, double f)
 {
	 double d = e-f;
     System.out.println("Subtraction result is" + " "+ d);
 }

 public static void main(String[] args) {
		
		NonStaticMethod obj = new NonStaticMethod();
				obj.subtraction();
				obj.subtraction(76, 90.65);
				obj.subtraction(40.00, 36.00);
	}

}
