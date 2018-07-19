/*
CountInstances uses class and instance variables to keep
track of how many instances of that class have been created.
 */
public class CountInstances {
    // class variable set to 0
    // class variable (declared static) bec. the number of instances is relevant to the class as a whole,
    // not any particular instance. It's private so that it can be retrieved only with an accessor method.
    private static int numInstances = 0;

    // class getter method to get the numInstances value
    // a get method is defined so that the private instance variable's value can be retrieved.
    // method is declared as static (class variable), as it applies directly to the class variable.
    // method declared protected as only this class & perhaps it's subclasses are interested in that value.
    protected static int getNumInstaces() {
        return numInstances;
    }

    // accessor method set & get
    // setter method is not needed to set a value
    // as the variable should be incremented only when a new instance created
    // class method to add the numInstance values
    private static void addInstace() {
        numInstances++;
    }

    // Constructors are called when a new object is created, making the most logical place to call addInstance() and
    // increment the variable
    CountInstances() {
        CountInstances.addInstace();
    }

    public static void main(String[] args) {

        System.out.println("Started with " +
        CountInstances.getNumInstaces() + " instances");

        for (int i = 0; i < 10; i++) {
            new CountInstances();

            System.out.println("Created " +
            CountInstances.getNumInstaces() + " instances");
        }
    }
}
