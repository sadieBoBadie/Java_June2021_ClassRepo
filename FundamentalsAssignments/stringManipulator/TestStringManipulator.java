public class TestStringManipulator {
    public static void main(String[] args) {
        /*
           Note, to run with assertions enabled
           use java -ea TestStringManipulator 
           to run the test file, it will throw an
           error if any test fails.
        */
        StringManipulator test = new StringManipulator();
        
        String testStr = test.trimAndConcat("  hello   ", "    moto    ");
        assert testStr.equals("hellomoto"): "hellomoto";
        
        assert test.getIndexOrNull("test", 'a') == null;
        assert test.getIndexOrNull("Some other sort of test.", 's').equals(11);

        assert test.getIndexOrNull("test", "est").equals(1);
        assert test.getIndexOrNull("Some other sort of test.", "sorl") == null; // null
        assert test.getIndexOrNull("Some other sort of test.", "macho") == null; // null
        
        String subwaySand = test.concatSubstring("testingsub", 7, 10, "way sandwich");
        assert subwaySand.equals("subway sandwich");

        String newTest = test.concatSubstring("testingsub", 11, 10, "way sandwich");
        // assert newTest.equals("subway sandwich");

        // String errorTest = test.concatSubstring("OutOfRange", 7, 13, "error");
        // assert subwaySand.equals("subway sandwich");
    }
}