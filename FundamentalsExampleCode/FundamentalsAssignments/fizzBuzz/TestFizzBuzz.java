public class TestFizzBuzz {
    public static void main(String[] args) {
        FizzBuzz test1 = new FizzBuzz();
        for (int i = 1; i <= 33; i++) {
            System.out.println(test1.getFizzBuzzString(i));
        }
    }
}