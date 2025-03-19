package inheritance;
class Apple{
	 Apple(int a)
	{
		System.out.println("Apple1");
	}
}
class Bat extends Apple{
	Bat(int a,double b)
  {
		super(4);
		System.out.println("Apple2");
	}
}
class Cat extends Bat{
	Cat(double v)
  {
		super(5,7.45);
		System.out.println("Apple3");
	}
}
public class Supercalling {

	public static void main(String[] args) {
		new Cat(4.78);
		
	}

}

