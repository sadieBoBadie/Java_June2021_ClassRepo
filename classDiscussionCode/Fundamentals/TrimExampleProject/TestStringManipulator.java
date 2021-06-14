public class TestStringManipulator {

    public static void main(String[] args) {
        
        // Instantiates an instance of the StringManipulator class
        // SO that we can call it's methods
        StringManipulator manipulator = new StringManipulator();

        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld

        String str1 = manipulator.trimAndConcat(" hey, Hana!","What's happening?    ");
        System.out.println(str1); // HelloWorld 

        String str2 = manipulator.trimAndConcat("123","    4567      ");
        System.out.println(str2); // HelloWorld 
    }

}