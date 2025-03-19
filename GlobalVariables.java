package GTMBatch50;

public class GlobalVariables {
	static int a = 24;
     static int b = 59;
     String name;
     double r;
     float f;
     boolean h;
	 void Addition()
	 {  
	     
	    b = 89; r=41;
        int c = a+b;
        
		double g = r+b;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		 System.out.println("Addition result is"+ " " + c);
		 System.out.println("Addition result is"+ " " + g);
		 System.out.println("String is"+" " + name);

		 System.out.println("boolean value is"+" " + h);

	 }

	public static void main(String[] args)
	{ 
		GlobalVariables L = new  GlobalVariables();
		L.Addition();

	}
}
