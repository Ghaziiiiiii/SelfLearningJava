/*
File name : AbstractDemo.java
 */
public class AbstractDemo {
    public static void main(String[] args) {
        /*
        Following is not allowed & would raise error.
        'Employee' is abstract; can not be instantiated.

        'class' or 'interface' expected
         */
        Employee e = new Employee("George W.", "Houston, TX", 43);

        System.out.println("\n Call mailCheck using Employee reference--");

        e.mailCheck();

        }
    }
}
