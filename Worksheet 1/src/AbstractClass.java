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

class Engine extends Bike {
    void run() {
        System.out.println("Engine running with no faults");
    }
}

class EngineTest extends Bike {
    void run() {
        System.out.println("Engine Running Safely..");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Bike obj1 = new Engine();
        obj1.run();

        Bike obj2 = new EngineTest();
        obj2.run();
    }
}
/*
In case there is ONLY 1 Abstract Class Method.
Bike the abstract class that contains only one abstract method run. It implementation is provided by the Honda class.

abstract class Bike{
  abstract void run();
}
class Honda4 extends Bike{

void run(){
    System.out.println("running safely..");
}

    public static void main(String args[]) {
     Bike obj = new Honda4();
     obj.run();
    }
}
 */