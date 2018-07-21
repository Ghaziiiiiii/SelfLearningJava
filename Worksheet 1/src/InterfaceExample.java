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


