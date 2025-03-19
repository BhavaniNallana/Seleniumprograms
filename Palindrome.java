package GTMBatch50;

public class Palindrome {
	public static void main(String[] args) {
	String input ="madam";
	String output = "";
	for(int i = input.length()-1;i>=0;i--)
	{
		char c = input.charAt(i);
		output = output+c;
	}

	
	
if(input.equals(output))
{
System.out.println("The Given string is a palindrome");
}
else
{
System.out.println("The Given string is not a palindrome");
}
}
}


