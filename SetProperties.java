package GTMBatch50;
import java.util.HashSet;
import java.util.Set;
public class SetProperties {
public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Set after adding elements: " + set);

        set.add(30); // Duplicate element
        set.add(50); // Duplicate element

        System.out.println("Set after attempting to add duplicate elements: " + set);

        System.out.println("Size of the set: " + set.size());

        System.out.println("Does the set contain 20? " + set.contains(20));
        System.out.println("Does the set contain 100? " + set.contains(100));

        set.remove(40);
        System.out.println("Set after removing 40: " + set);

        System.out.println("Is the set empty? " + set.isEmpty());

        set.clear();
        System.out.println("Set after clearing all elements: " + set);

        System.out.println("Is the set empty now? " + set.isEmpty());
    }
}
