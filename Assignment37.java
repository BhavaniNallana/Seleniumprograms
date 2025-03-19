package GTMBatch50;

public class Assignment37 {

	public static void main(String[] args) {
		int array[] = {2,4,6,8};
	int sum = 0;
     int length = array.length;
     for(int i=0; i<length; i++)
     {
    	 sum = sum + array[i];
     }
	 float average = sum/length;

     System.out.println("Average of the numbers is " + average);
	}

}
