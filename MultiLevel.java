package inheritance;
class zero
{
static void read()
	{
		System.out.println("I love reading");
	}
}
 class one extends zero
 {
static void play()
	{
		System.out.println("I love playing");
	}
 }
 class two extends one
	{
		static void paint()
		{
			System.out.println("I love painting");
		}
	}
public class MultiLevel extends two
{
	static void dance()
	{
		System.out.println("I love dancing");
	}
	public static void main(String[] args)
	{
     read();
     dance();
     paint();
     play();
	} 
}


