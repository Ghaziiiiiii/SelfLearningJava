/*
Using interface we can achieve multiple inheritance & achieve 100% abstraction
fields of inerface --> public, static, final (all set by default)
Interfaces can also have abstract method (which have no body)
eg:
interface Printable {                               interface Printable {
    int min = 5;        ---> { COMPILE } --->           public static final int min = 5;
    void print();                                       public abstract void print();
}                                                   }
 */

interface Printable {
    void print();
}

interface Showable extends Printable {
    void show();
}

public class InterfaceExample implements Showable {

    public void print() {
        System.out.println("Helllooooo");
    }

    public void show() {
        System.out.println("Hiiiii");
    }

    public static void main(String[] args) {

        InterfaceExample obj = new InterfaceExample();

        obj.print();
        obj.show();

    }
}


