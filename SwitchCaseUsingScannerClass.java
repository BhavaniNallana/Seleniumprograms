package GTMBatch50;

import java.util.Scanner;

public class SwitchCaseUsingScannerClass {

	public static void main(String[] args)
	{ 
		Scanner s1 = new Scanner(System.in);
        System.out.println("Select a case");
		int value = s1.nextInt();
	switch(value)	
	{
   case 1:
		System.out.println("Case 1");
		break;
     case 2:
		System.out.println("Case 2");
		break;
     case 3:
		System.out.println("Case 3");
		break;
		default:
			System.out.println("Case 0");
s1.close();
	
	}
	}
}
