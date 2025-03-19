package GTMBatch50;

import java.util.Arrays;

public class Assignment29 {

	public static void main(String[] args) {
int abc[]= new int[4];
abc[0]=1;
abc[1]=11;
abc[2]=111;
abc[3]=1111;
int reverse[]= new int[4];
for(int i =0,j=3;i<=3;i++,j--)
{
	reverse[j] = abc[i];
}
System.out.println("Given Array is"+Arrays.toString(abc));
System.out.println("Reverse Array is"+Arrays.toString(reverse));

}

}
