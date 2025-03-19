package GTMBatch50;

class MethodOverriding1 {
    void learn() {
        System.out.println("Bhavani learns JAVA");
    }
}

class Nalla extends MethodOverriding1 {
    @Override
    void learn() {
        System.out.println("Bhavani learns Selenium");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Nalla m = new Nalla();
        m.learn(); 
    }
}
