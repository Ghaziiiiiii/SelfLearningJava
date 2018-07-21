/*
This Sample class checks the Access Control for Methods/Variables
The access modifiers checked are Public, Default, Protected, Private
Encapsulation is the process that prevents class variables from being read or
modified by other classes
 */

class A {
    // Public
    // Public methods/variables can be accessed from anywhere
    // From any package, or outside package using or even sub-class
    // within the same package or outside package. Just import package when needed
    public void msg() {
        System.out.println("This message is Public");
    }
}

class B {
    // Default
    // No access from any class outside the package/Available access for any class in same package
    // No access from a subclass outside the same package/Available access for a subclass in same package
    void msg() {
        System.out.println("This message is set Default");
    }
}

class C {
    // Protected
    // Cannot be accessed from any class outside the package
    // Sub classes can accesss either from the same package or outside
    protected void msg() {
        System.out.println("This message is Protected");
    }
}

public class Sample {
    // Private
    // The Private variables/method will ONLY work within the same class aka. the main class.
    // on creating a separate class ABCD outside the main class Sample with private variables
    // and methods, will give a compile time error saying the variables/method are Private.
    // Private can ONLY be accessed within the SAME Class and not from any class within the
    // Same Package or any class outside the package or a sub-class in the same/outside package
    private int data = 40;
    private void msg() {
        System.out.println("This message is Private");
    }

    public static void main(String[] args) {

        A objectA = new A();
        objectA.msg();

        Sample object1 = new Sample();
        object1.msg();

        B object2 = new B();
        object2.msg();

        C object3 = new C();
        object3.msg();
    }
}
