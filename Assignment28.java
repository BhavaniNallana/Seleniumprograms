package GTMBatch50;

import java.util.Arrays;

public class Assignment28 {

    public static void main(String[] args) {
        int array1[] = new int[3];
        array1[0] = 1;
        array1[1] = 12;
        array1[2] = 123;

        System.out.println("Given Array: " + Arrays.toString(array1));

        int newarray[] = new int[3];
        
        for (int i = 0; i < array1.length; i++) 
        {
            newarray[i] = array1[i];
        }

        System.out.println("New Array: " + Arrays.toString(newarray));
    }
}
