package EightElevenTask;

public class EqaulityPrinter {
    private static final String INVALID_VALUE = "Invalid Value";
    private static final String ARE_EQUAL = "All numbers are equal";
    private static final String ARE_DIFFERENT = "All numbers are different";
    private static final String NOT_ALL_EQUAL_OR_DIFFERENT = "Neither all are equal or different";

    public void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0)
            System.out.println(INVALID_VALUE);
        else if (a == b && a == c)
            System.out.println(ARE_EQUAL);
        else if(a != b & b != c && a != c)
            System.out.println(ARE_DIFFERENT);
        else
            System.out.println(NOT_ALL_EQUAL_OR_DIFFERENT);
    }
}
