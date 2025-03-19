package GTMBatch50;
import java.util.Arrays;
public class Anagram {
public static void main(String[] args) {
     String input1 = "listen";
     String input2 = "silent";
     if(input1.length()!=input2.length())
     {
    	 System.out.println("The Strings are not Anagrams");
     }
     else
     {
    	 System.out.println("The Strings are Anagrams");

     }
   char c1[]= input1.toCharArray();
   char c2[]= input2.toCharArray();
   Arrays.sort(c1);
   Arrays.sort(c2);
if(Arrays.equals(c1,c2)==true)
{
	 System.out.println("Anagram");
	 
}
else
{
	 System.out.println("Not Anagram");
}
}

}
