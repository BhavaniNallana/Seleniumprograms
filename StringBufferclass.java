
package GTMBatch50;

public class StringBufferclass {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Bhavani");
        System.out.println(sb1.append("Nalla"));
        System.out.println(sb1.replace(3,7, "S"));
        System.out.println(sb1.toString().toUpperCase());
        System.out.println(sb1.indexOf("l"));
        System.out.println(sb1.insert(2,"dear"));
        System.out.println(sb1.delete(2,6));
        System.out.println(sb1.reverse());
       System.out.println(sb1.capacity());
       System.out.println(sb1.charAt(6));
        System.out.println(sb1.length());
        System.out.println(sb1.substring(1));
        System.out.println(sb1.substring(1,5));

        







    }

}
