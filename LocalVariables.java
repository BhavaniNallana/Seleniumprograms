package GTMBatch50;

public class LocalVariables {
	
	static void Addition()
	 {
		 int a = 44;
         int b = 54;
         int c = a+b;
         
		 System.out.println("Addition result is" + " "+ c);
	 } 
	
	void subtraction()
	 {
		 int a = 78;
		 int b = 98;
		 int c = b-a;
		 System.out.println("Subtraction result is" + " "+ c);
	 }
	public static void main(String[] args)
	{ 
		Addition();
		LocalVariables obj = new LocalVariables();
		obj.subtraction();
	}

	}
