package GTMBatch50;
import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		 Map<String, Double> nameAndBodyweight = new HashMap<>();
        nameAndBodyweight.put("Bhavani", 60.00);
        System.out.println("Name and Bodyweight:");
        for (Map.Entry<String, Double> entry : nameAndBodyweight.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " kg");
        }
        System.out.println();

        Map<String, String> bankDetails = new HashMap<>();
        bankDetails.put("SBI Bank", "1234567890");
        

        System.out.println("Bank Name and Bank Account ID:");
        for (Map.Entry<String, String> entry : bankDetails.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();


        Map<String, String> nameDetails = new HashMap<>();
      
        nameDetails.put("Bhavani", "Nalla");

        System.out.println("Firstname and Lastname:");
        for (Map.Entry<String, String> entry : nameDetails.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        Map<String, Integer> householdItems = new HashMap<>();
        householdItems.put("Toothpaste", 3);
        householdItems.put("Shampoo", 2);
       

        System.out.println("Household Items and their Quantities:");
        for (Map.Entry<String, Integer> entry : householdItems.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " items");
        }
    }
}



		  
