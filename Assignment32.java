package GTMBatch50;

import java.util.Arrays;

public class Assignment32 {

	public static void main(String[] args) {
		 int count = 0;
		 String hai = "JMJ @ 123";
		 char c[] = hai.toCharArray();
		 System.out.println(Arrays.toString(c));
		 for(int i = 0;i<c.length;i++)
		 {
		 	boolean b1 = Character.isAlphabetic(c[i]);
		  if( b1 == true)
		 {
		 	count++;
		 }

		 	
		 	}

		 System.out.println(count);
		 
		}
		
	}


