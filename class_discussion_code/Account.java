public class Account {

    public String saltPassword(String password,) {
        int leftLimit = 97;
        int rightLimit = 122;
        char[] charArr = new char[5];
        Random r = new Random();
        for (int i = 0; i < charArr.length; i++) {
            int randomInt = r.nextInt((rightLimit - leftLimit) + 1) + leftLimit;
            charArr[i] = (char) randomInt;
        }
        String saltedPassword = Arrays.toString(charArr) + password;
        return saltedPassword;
    }
}

// 1.) What else do I need other than what you see here to run this code?
        -- compile
        -- main --> Another file ExampleTest.java
        -- public static void main(String[] args)

// 2.) What is the name of the class?
    -- Account
// 3.) What might I need to fix here, inorder for this file to compile??
    // HINT -- 2 things, having to do with the class itself.
    -- Filename must match class name. class keyword omitted

// 4.) What is the name of the method inside this class?
    -- saltPassword
// 5.) How many arguments does the method take?
    -- 1!
// 6.) What are the parameter names for the method?
    -- password
// 7.) What is the return type of the method?
    -- String