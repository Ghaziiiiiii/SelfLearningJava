/*
**Abstraction** is a process of hiding the implementation details & showing only functionality to the user.
*
* Another way, it shows only important things to the user and hides the internal details for example sending sms,
* you just type the text and send the message. You don't know the internal processing about the message delivery.
*
* Abstraction lets you focus on what the object does instead of how it does it.
*
*/

abstract class Bike {
    abstract void run();    // an abstract method has no body
}

public class AbstractClass extends Bike{

    void run() {
        System.out.println("running safely..");
    }

    public static void main(String[] args) {

    Bike object = new AbstractClass();
        object.run();
    }
}
