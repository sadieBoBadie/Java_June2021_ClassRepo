import java.lang.Math;

public class StringManipulator {

    // Trim both input strings and then concatenate them. 
    // Return the new string. Feel free to use the trim method 
    // of the String class.
    
    public String trimAndConcat(String str1, String str2) {
        
        System.out.println(Math.pow(3, 9));
        // make a variable for a new string
        // add them together/concat
        // String newStr = str1.trim() + " " + str2.trim();
        
        return String.concat(str1.trim(), " ", str2.trim())
    }

    public Integer getIndexOrNull(String str1, String str2) {
        // code here

    }

}