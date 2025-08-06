public class Scope {
    static int staticar = 100; 
    final int finalvar = 999; 

    int instancevar = 200;

    public void method() {
        int localVar = 300; 

        // Block scope
        if (true) {
            int blockVar = 400;
            System.out.println("Block Variable " + blockVar);
        }
        // blockVar not accessible here
        System.out.println("Local Variable " + localVar);
    }

    public static void main(String[] args) {
        ScopeExample obj = new ScopeExample();
        obj.method();
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Final Variable: " + obj.finalVar);
    }
}
