package GTMBatch50;
class one{
	void sub()
	{
		System.out.println("a-b");
	}
}

public abstract class AbstractClass extends one{
	static void add() {
		
	}
	{
		System.out.println("a+b");
	}

	public static void main(String[] args) {
		one o = new one();
		o.sub();
		add();
		
	}

}
