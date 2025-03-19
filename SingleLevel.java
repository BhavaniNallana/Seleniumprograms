package inheritance;
class Parent
{
 void login()
{
	System.out.println("Logging into google");
}
 void logout()
{
	System.out.println("Logging out from google");
}
}
public class SingleLevel extends Parent
{
 void testcase()
{
	System.out.println("Testcase is passed");
}
	public static void main(String[] args) {
		SingleLevel s = new SingleLevel();
		s.testcase();
        s.login();
        s.logout();
	}
}

