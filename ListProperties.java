package GTMBatch50;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class ListProperties {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(65);
        l1.add(54);
        l1.add(34);
        l1.add(32);
        l1.add(24);
        
        System.out.println("List: " + l1);

        // Creating an iterator for the list
        Iterator<Integer> i = l1.iterator();
        
        // Iterating through the list and printing elements
        System.out.println("Iterating over the list in forward direction:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // Creating a ListIterator for iterating in both directions
        ListIterator<Integer> i1 = l1.listIterator();
        
        // Iterating through the list in forward direction using ListIterator
        System.out.println("Iterating over the list in forward direction using ListIterator:");
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        
        // Iterating through the list in reverse direction using ListIterator
        System.out.println("Iterating over the list in reverse direction:");
        while (i1.hasPrevious()) {
            System.out.println(i1.previous());
        }
    }
}
