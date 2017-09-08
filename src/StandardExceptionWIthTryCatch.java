public class StandardExceptionWIthTryCatch {
    public static void main(String[] args) {
        int varOne, varTwo;

        try {
            varOne = 0;
            varTwo = 10/varOne;
            System.out.println("This will not print");
        }catch (ArithmeticException ex)
        {
            System.out.println("Division By Zero");
            System.out.println("Exception: " + ex);
        }
        System.out.println("After Catch Block");
    }

}
