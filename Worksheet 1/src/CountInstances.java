/*
CountInstances uses class and instance variables to keep
track of how many instances of that class have been created.
 */
public class CountInstances {

    // class variable set to 0
    private static int numInstances = 0;

    // class getter method to get the numInstaces value
    protected static int getNumInstaces() {
        return numInstances;
    }

    // class method to add the numInstance values
    private static void addInstace() {
        numInstances++;
    }

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
