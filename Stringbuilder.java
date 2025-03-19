package GTMBatch50;

public class Stringbuilder {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Bhavani");
        System.out.println(s.append("Nalla")); // Appends "Nalla" to "Bhavani"
        System.out.println(s.replace(3, 7, "S")); // Replaces "vani" with "S" (index 3 to 7)
        System.out.println(s.toString().toUpperCase()); // Converts the string to uppercase
        System.out.println(s.indexOf("l")); // Finds the first occurrence of 'l'
        System.out.println(s.insert(2, "dear")); // Inserts "dear" at index 2
        System.out.println(s.delete(2, 6)); // Deletes characters from index 2 to 6
        System.out.println(s.reverse()); // Reverses the string
        System.out.println(s.capacity()); // Prints the capacity of the StringBuilder object
        System.out.println(s.charAt(6)); // Prints the character at index 6
        System.out.println(s.length()); // Prints the length of the string
        System.out.println(s.substring(1)); // Prints the substring starting from index 1
        System.out.println(s.substring(1, 5)); // Prints the substring from index 1 to 5
    }

}
