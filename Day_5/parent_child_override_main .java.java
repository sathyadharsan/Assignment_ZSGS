package overrride;

class Parent {

    private void private_method() {
        System.out.println("I am private method from parent");
    }

    public void staic_methods() {
        System.out.println("I am static methods from parent");
    }

    final void finalmethods() {
        System.out.println("I am final methods from parent");
    }

    public Parent() {
        System.out.println("I am from parent constructor");
    }
}

class Child extends Parent {

    // This is not overriding, it's a new private method
    private void private_method() {
        System.out.println("I am private method from child");
    }

    // This is overriding
    @Override
    public void staic_methods() {
        System.out.println("I am static methods from child");
    }

    // this would normally cause compile error since parent method is final
    // So we must comment or remove this:
    /*
    @Override
    final void finalmethods() {
        System.out.println("I am final methods from child");
    }
    */

    // Correct constructor name: Child()
    public Child() {
        System.out.println("I am from child constructor");
    }
}

public class parent_child_override_main {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.staic_methods();
        ch.finalmethods();
    }
}
