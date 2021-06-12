import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.HashSet;

public class PuzzleJava {
    
    // Print the sum of all numbers in the array. Also have the function 
    // return an array that only includes numbers that are greater than 
    // a given value.
    public static ArrayList<Integer> arrValsLargerThan(int compareVal, ArrayList<Integer> numbers) {
        int sum = 0;
        ArrayList<Integer> numsOverCompareVal = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            Integer val = numbers.get(i);
            sum += val;
            if (val > compareVal) {
                numsOverCompareVal.add(val);
            }
        }
        System.out.println(sum);
        return numsOverCompareVal;
    }


    // Shuffle the array and print the name of each person. Have the method 
    // also return an array with names that are longer than given number of characters.
    public static ArrayList<String> namesLongerThan(int compareVal, ArrayList<String> nameList){
        
        Collections.shuffle(nameList);
        ArrayList<String> longerNamesList = new ArrayList<String>();
        
        for (int i = 0; i < nameList.size(); i++) {
            String name = nameList.get(i);
            System.out.println(name);
            if (name.length() > compareVal) {
                longerNamesList.add(name);
            }
        }
        return longerNamesList;
    }


    // Create an array that contains all 26 letters of the alphabet 
    // (this array must have 26 values). Shuffle the array and, after shuffling, 
    // display the last letter from the array. Have it also display the 
    // first letter of the array. If the first letter in the array is a vowel, 
    // have it display a message.
    public static void alphaFirstAndLast() {

        ArrayList<Character> alphabet = new ArrayList<Character>();
        // Using UNICODE math to go through letters
        for (char letter = 'a'; letter <= 'z'; letter++) {
            // Add each char as a Character to alphabet
            alphabet.add((Character)letter);
        }

        // Shuffle
        int last = alphabet.size() - 1;
        Collections.shuffle(alphabet);
        // System.out.println(alphabet);

        // Print last then first letter
        System.out.println(alphabet.get(last));
        System.out.println(alphabet.get(0));

        // Create the set of vowels
        List<Character> vowelValues = Arrays.asList('a', 'e', 'i', 'o', 'u');
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.addAll(vowelValues);

        // If it's a vowel, print the message.
        if (vowels.contains(alphabet.get(0))) {
            
            System.out.println("You have started with a vowel, human.");
            return;
        }
    }

    // Generate and return an array with 10 random numbers between 55-100.
    public static int[] tenRandomNumbers() {

        int[] randomNumbers = new int[10];

        Random randomNumGenerator = new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = randomNumGenerator.nextInt(45) + 55;
        }
        return randomNumbers;
    }


    // Generate and return an array with 10 random numbers between 55-100 
    // and have it be sorted (showing the smallest number in the beginning). 
    // Display all the numbers in the array. Next, display the minimum value 
    // in the array as well as the maximum value.
    public static ArrayList<Integer> tenRandomNumbersSorted() {

        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        Random randomNumGenerator = new Random();

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(randomNumGenerator.nextInt(45) + 55);
        }

        Collections.sort(randomNumbers);
        System.out.println(randomNumbers);
        System.out.printf("Minimum is %s, Maximum is %s\n", randomNumbers.get(0), randomNumbers.get(randomNumbers.size() - 1));
    
        return randomNumbers;
    
    }

    // Create a random string that is 5 characters long.
    public static String randomFiveLetters() {
        String randString = new String();
        Random randomNumGenerator = new Random();
        for (int i = 0; i < 5; i++) {
            char letter = (char)('a' + randomNumGenerator.nextInt(26));
            randString += letter;
        }
        // System.out.println(randString);
        return randString;
    }

    // Generate an array with 10 random strings that are each 5 characters long
    public static ArrayList<String> tenRandomStrings() {
        ArrayList<String> randomStrings = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            randomStrings.add(randomFiveLetters());
        }
        return randomStrings;
    }
}