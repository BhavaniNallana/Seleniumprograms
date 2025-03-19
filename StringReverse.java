package GTMBatch50;

public class StringReverse {

	public static void main(String[] args) {
     String str = "Bhavani";
     String output = "";
 	for(int i = str.length()-1;i>=0;i--)
 	{
 		char c = str.charAt(i);
 		output = output+c;
 	}
 	System.out.println("Reversed string is " + output );
	}

}
