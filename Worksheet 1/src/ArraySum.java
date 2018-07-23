/*
ArraySum class
To compute the sum of integers in an array
 */

public class ArraySum {
    public static void main(String[] args) {

        int[] array1 = {4, 10, 5, 4, 5, 2};
        int sum = 0;

        for (int counter = 0; counter < array1.length; counter++) {
            sum =+ array1[counter];
            System.out.println(sum);

        }
        System.out.println(sum);
    }
}
