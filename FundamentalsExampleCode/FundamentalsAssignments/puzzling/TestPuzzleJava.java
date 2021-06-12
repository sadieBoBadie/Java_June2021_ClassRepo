import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args) {
        
        PuzzleJava calculate = new PuzzleJava();

    /******************** arrValsLongerThan TEST *******************/

        // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32.
        List<Integer> numValues = Arrays.asList(3,5,1,2,7,9,8,13,25,32);
        // Type test: returns an ArrayList that implements List interface.
        // System.out.println(numValues.getClass().getSimpleName()); 
        ArrayList<Integer> numsArray = new ArrayList<Integer>();
        numsArray.addAll(numValues);
        
        ////////// UNCOMMENT TO TEST //////////
        // ArrayList<Integer> bigNums = calculate.arrValsLargerThan(10, numsArray);
        // System.out.println(bigNums);
        // // (e.g. when you pass the array above, and the number 10, it should return an array 
        // // with the values of 13,25,32)

    /******************** namesLongerThan TEST *******************/

        // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa.
        List<String> nameValues = Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa");
        ArrayList<String> namesArray = new ArrayList<String>();
        namesArray.addAll(nameValues);

        ////////// UNCOMMENT TO TEST //////////
        // ArrayList<String> bigNames = calculate.namesLongerThan(7, namesArray);
        // System.out.println(namesArray);
        // System.out.println(bigNames);
        // // Shuffles ==> Names should be in a different order.
        // // bigNames ==> ["Fujibayashi", "Ishikawa"]

    /******************** alphaFirstAndLast TEST *******************/

    // calculate.alphaFirstAndLast();

    /******************** tenRandomNumbers TEST *******************/

    // int[] tenRandom = calculate.tenRandomNumbers();

    // Note: Use Arrays class' toString method to print the whole array.
    // When printing arrays it's default representation is silly
    // example: [I@45e45f --> which is it's type code followed by '@' then its hash.
    
    // ////////// UNCOMMENT TO TEST //////////
    // System.out.println(Arrays.toString(tenRandom));

    // ArrayList<Integer> tenRandomSorted = calculate.tenRandomNumbersSorted();
    // System.out.printf("Returned: %s\n", tenRandomSorted);


    /******************** random strings TESTS *******************/

    System.out.println(calculate.randomFiveLetters());
    System.out.println(calculate.tenRandomStrings());

    /**************** NOTES SECTION ******************/
        /*
        // Examples of usage for Collections and Random

        Collections.shuffle(numbers);
        System.out.println(numbers); // [1, 5, 2, 4, 3]
        Collections.sort(numbers);
        System.out.println(numbers); // [1, 2, 3, 4, 5]
                
        Random r = new Random();
        System.out.println(r.nextInt()); // without bounds
        System.out.println(r.nextInt(5)); // with bounds 0 to 5
        */
    }
}