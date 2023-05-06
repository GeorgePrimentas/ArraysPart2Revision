// Imports from the java.util package/library the Random class
import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        // Declares an integer array called "myArray"
        // and sets the number of its elements to 10
        int[] myArray = new int[10];
        // Instantiates a new object of the Random class
        // called "rand" (in other words, it creates a new
        // instance of the Random class)
        Random rand = new Random();

        // Generates 10 random elements for the array
        for (int i = 0; i < myArray.length; i++) {
            // Declares an integer variable called "num" and
            // assigns it a random value between 1 and 100;
            // "rand" is the object, "nextInt" is a method that
            // defines that the random integer will be between
            // 0 (inclusive) and 100 (exclusive); the "+1" bit
            // adds 1 to the current value, making it an integer
            // between 1 and 100 (inclusive)
            int num = rand.nextInt(100) + 1;
            myArray[i] = num;
            System.out.print(myArray[i] + " ");
            // If we wanted to have the various numbers separated
            // by commas, it would be an example of applying the
            // use of do/while loop. The first number would be
            // displayed anyway and the rest of the numbers would
            // be displayed as: ", " + myArray[i]
        }

        // The next two lines declare two integer variables
        // (max and min) and initiate them with the value of
        // the first element of the array myArray
        int max = myArray[0];
        int min = myArray[0];

        // In the following loop each element of myArray is
        // compared to the value of the min variable and if
        // it's less than it (if it's smaller), the min variable
        // is assigned (changed to) its value. If it's not
        // smaller another comparison takes place: if the element
        // is greater (bigger) than the value of the max variable,
        // the max variable is assigned its value
        for (int i = 0; i < myArray.length; i++) {
            // The following type of if syntax is allowed because
            // after the condition there is only one statement
            // to be executed (i.e. no need for BLOCK of code)
            if (myArray[i] < min) min = myArray[i];
            else if (myArray[i] > max) max = myArray[i];
        }
        // The next two lines display the minimum and the maximum
        // numbers of the array. On the first one the "\n" moves
        // the cursor (printing position) to the next line
        System.out.println("\nMinimum of these numbers is: " + min);
        System.out.println("Maximum of these numbers is: " + max);
    }
}