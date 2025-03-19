package GTMBatch50;

import java.util.Vector;

public class VectorClass {

    public static void main(String[] args) {
        
       Vector<Object> vector = new Vector<>();
        vector.addElement("Apple");
        vector.addElement("Banana");
        vector.addElement("Cherry");
        
        System.out.println("Vector after adding elements: " + vector);
         System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
        
        vector.removeElement("Banana");
        System.out.println("Vector after removing 'Banana': " + vector);
        
        vector.removeElementAt(0); 
        System.out.println("Vector after removing element at index 0: " + vector);
        
        
        vector.removeAllElements();
        System.out.println("Vector after removing all elements: " + vector);
        
        
        vector.addElement("Mango");
        vector.addElement("Grapes");
        System.out.println("Vector current capacity: " + vector.capacity());
        
    }
}
