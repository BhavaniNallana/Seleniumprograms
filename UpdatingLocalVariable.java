package GTMBatch50;

public class UpdatingLocalVariable {
	
	void addition()
	{
		int a = 34;
		int b = 43;
		b = 21;
       int sum = a+ b;
		
		System.out.println("Addition result is"+" "+ sum);
	}
static	void addition1()
	{
		int a = 22;
		int b = 43;
		b = 22;
       int sum = a+ b;
		System.out.println("Addition result is"+" "+ sum);
	
	}
	public static void main(String[] args) {
		UpdatingLocalVariable u = new UpdatingLocalVariable();
		u.addition();
		 addition1();
	}

}
