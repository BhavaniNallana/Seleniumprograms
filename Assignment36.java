package GTMBatch50;

public class Assignment36 {

	public static void main(String[] args) {
int array[] = new int[4];
array[0]= 23;
array[1]=24;
array[2]=25;
array[3]=26;
int numbertocheck=24;
for(int i=0;i<=array.length-1;i++)
{
	if(numbertocheck==array[i])
	{
		System.out.println("Number is present at index" +" " + i);
	}
}
	}

}
