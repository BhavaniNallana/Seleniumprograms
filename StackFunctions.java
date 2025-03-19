package GTMBatch50;

import java.util.Stack;

public class StackFunctions {

	public static void main(String[] args) 
	{
		
  Stack<String> s1 = new Stack();
  s1.add("54");
  s1.add("76");
  s1.add("32");
  System.out.println(s1);
  s1.pop();
  System.out.println(s1);
  System.out.println(s1.peek());
  System.out.println(s1.push("11"));
  System.out.println(s1.search("54"));

	}

}
