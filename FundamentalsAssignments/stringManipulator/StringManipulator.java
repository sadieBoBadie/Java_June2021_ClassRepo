public class StringManipulator {
    /*
    [X] String trimAndConcat(String, String): 
    Trim both input strings and then concatenate them. 
    Return the new string. Feel free to use the trim method of the String class.
    */
    public String trimAndConcat(String str1, String str2) {
        return str1.trim().concat(str2.trim());
    }

    /* 
    [X] Integer getIndexOrNull(String, char): 
    Get the index of the character and return either the index or null. 
    If the character appears multiple times, return the first index. 
    Feel free to use the indexOf method of the String class. 
    */
    public Integer getIndexOrNull(String str, char letter) {
        Integer idx = (Integer) str.indexOf(letter);
        if(idx > -1){
            return idx;
        };
        return null;
    }

    /* 
    [] Integer getIndexOrNull(String, String): 
    Get the index of the start of the substring and return either the index or null. 
    Feel free to use the indexOf method of the String class.
    */
    public Integer getIndexOrNull(String str, String substring) {
        Integer idx = (Integer) str.indexOf(substring);
        if(idx > -1){
            return idx;
        };
        return null;
    }

    /*
    [X] String concatSubstring(String, int, int, String): 
    Get a substring using a starting and ending index, 
    and concatenate that with the second string input to our method. 
    Feel free to use the substring method of the String class.
    */

    public String concatSubstring(String inputStr, int idx1, int idx2, String newStr) {
        String subStr = "error";
        try {
            subStr = inputStr.substring(idx1, idx2);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println(String.format("You got pawned: %s", e ));
        }
        return subStr.concat(newStr);
    }
}