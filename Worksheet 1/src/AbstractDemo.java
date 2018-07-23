/*
File name : AbstractDemo.java
 */
public class AbstractDemo {
    public static void main(String[] args) {

        Salary s = new Salary("Miagi Yushimito", "Tokyo, Japan", 5, 50000.00);

        Employee e = new Employee("George W.", "Houston, TX", 43);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();

        }
    }

