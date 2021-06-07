import java.util.ArrayList;

public class ObjectTypeExample {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(numbers2);

        if (str1 == str2) {
            System.out.println("The greetings are the same!");
        }
        else {
            System.out.println("Not the same.");
        }
    }
}