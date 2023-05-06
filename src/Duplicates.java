// Imports from the java.util package/library the Random class
import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        // Creates two integer arrays, one (array1) with 12 elements,
        // and another (array2) with 8 elements
        int[] array1 = new int[12];
        int[] array2 = new int[8];

        // Changes the 0 value of the elements of array1
        // to randomly created integers
        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomGenerator.nextInt(20) + 1;
            System.out.print(array1[i] + " ");
        }

        // Changes the 0 value of the elements of array2
        // to randomly created integers
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = randomGenerator.nextInt(20) + 1;
            System.out.print(array2[i] + " ");
        }

        // Takes every element of array1 and compares each
        // with every element of array2; if the two elements
        // have the same value, the value is displayed on the
        // screen
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) System.out.println(array1[i]);
            }
        }
    }
}