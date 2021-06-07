public class Test {

    // public -- access modifier
    // static -- OOP
    // void -- return TYPE

    public static void main(String[] args) {
        
        ClassWithAllTheFunctions testObject = new ClassWithAllTheFunctions();

        int sum = testObject.addNums(4, 5);
        System.out.println(sum);

        // System.out.println("Hello world!");
        // System.out.println("Another line");

        int wholeNumber = 5;
        String greeting = "Hey what's up??";
        boolean isMember = true;
        double largeDecimal = 4.23049824509808;
        float smallerDecimal;

        int[] numArray = {2, 3, 4, 5, 6, 7};
        String[] countries = {"Mexico", "Chile"};
        int[] counts = new int[10];

        // countries = 67;

        // System.out.printf("My variables: numArray %s, countries %s, counts %s", numArray, countries, counts);
    }

    
}

