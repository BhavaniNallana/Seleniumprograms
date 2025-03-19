package GTMBatch50;

import java.util.Arrays;

public class Assignment30 {

	public static void main(String[] args)
	{
	int array1[] = new int[4];
	int array2[] = new int[4];
	array1[0]=20;
	array1[1]=30;
	array1[2]=40;
	array1[3]=50;
	array2[0]=20;
	array2[1]=30;
	array2[2]=40;
	array2[3]=50;
	System.out.println("First Array is "+Arrays.toString(array1));
	System.out.println("Second Array is "+Arrays.toString(array2));
	boolean answer = Arrays.equals(array1, array2);
	if(answer == true)
	{
		System.out.println("Arrays are equal");
	}
	else
	{
		System.out.println("Arrays are not equal");
	}
	}

}
