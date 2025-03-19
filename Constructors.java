package GTMBatch50;

public class Constructors {
	Constructors()
    {
	System.out.println("This is a constructor without parameters");
	}
	Constructors(int a, int b)
	{
		System.out.println("This is a constructor with Parameters");
	}
	Constructors(int a, double b)
	{
		System.out.println("With Parameters");
	}
	Constructors(int side)//to calculate area of square
	{
	double area =side*side; 
	System.out.println("The area of the square with side " + side + " is: " + area);

	}
	public static void main(String[] args) {
		  new Constructors();
		  new Constructors(76,84);
		  new Constructors(34,76.84);
		  new Constructors(5);
	      new Constructors(10);
	} 
	}








