package GTMBatch50;

public class ThisCalling {

		ThisCalling()
	    {
		System.out.println("This is a constructor without parameters");
		}
		ThisCalling(int a, int b)
		{
			this();
			System.out.println("This is a constructor with Parameters");
		}
		ThisCalling(int a, double b)
		{
          this(3,6);
			System.out.println("With Parameters");
		}
		public static void main(String[] args) {
			  new ThisCalling(34,76.84);
		} 
		

	}


