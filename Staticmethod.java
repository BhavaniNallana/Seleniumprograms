package GTMBatch50;

public class Staticmethod {
  static void AddtwoNumbers(int a,int b)
  {
	  int r = a+b;
	  System.out.println("Addition result is" + " "+ r);

  }
  static void AddtwoNumbers(int a,double b)
  {
	  double d = a+b;
	  System.out.println("Addition result is" + " "+ d);
  }
  public static void main(String[] args) {
  AddtwoNumbers(34,23);
  AddtwoNumbers(23,98.65);
  

}

		    
		    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* static int calculateSum(int num1, int num2) 
		     {
		        return num1 + num2;
		    }

		    public static void main(String[] args) {
		        
		        int result = Staticmethod.calculateSum(10, 20);
		        
		       
		        System.out.println("The sum of 10 and 20 is: " + result);
		    }*/
		


	}


