public class ChainExceptionDemo {
    static void demoProc(){
        NullPointerException exception = new NullPointerException("Top Layer");
        exception.initCause(new ArithmeticException("Cause"));
        throw exception;
    }

    public static void main(String[] args) {
        try{
            demoProc();
        }catch (NullPointerException ex){
            System.out.println("Caught >>> "+ ex);
            System.out.println("\nOriginal Cause >>> "+ex.getCause());
        }
    }
}
