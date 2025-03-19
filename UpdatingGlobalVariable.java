package GTMBatch50;

public class UpdatingGlobalVariable {

static void add()
{
	 int a = 10;
     int b = 4;
	 b=2;
	 int sum = a+b;

	System.out.println("Addition result is" + " "+ sum);
	
}
 void sub()
{
int a = 76;
int b = 32;
b=10;
int sub = a-b;
	System.out.println("Addition result is" + " "+ sub);
	
}
	public static void main(String[] args) {
   add();
   UpdatingGlobalVariable a = new UpdatingGlobalVariable();
   a.sub();
	}

}
