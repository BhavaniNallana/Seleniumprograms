
package GTMBatch50;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment27 {

    public static void main(String[] args) {
        int a[] = new int[4];
        Scanner s1 = new Scanner(System.in);
        
        for (int i=0;i<=3;i++) 
        {
            a[i] = s1.nextInt();
        }

        System.out.println(Arrays.toString(a));
        s1.close();
    }
}
