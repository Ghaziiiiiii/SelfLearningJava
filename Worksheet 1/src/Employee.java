/*
File name : Employee.java

Except abstract methods the Employee class is same as normal class in Java.
The class is abstract, but it still has 3 fields, 7 methods, and 1 constructor.
 */
public abstract class Employee {
    // instance variable
    private String name;
    private String address;
    private int number;

    // constructor method invoked to create an object
    public Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " ");
    }

    @Override
    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}
