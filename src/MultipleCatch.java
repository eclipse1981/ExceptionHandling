public class MultipleCatch {
    public static void main(String[] args) {
       try{
           int a = args.length;
           System.out.println("a= "+ a);
           int b = 42/a;
           int c[] = {1};
           c[42] = 99;

       }catch (ArithmeticException ex){
           System.out.println("Divide By Zero >>> " + ex);
       }catch (ArrayIndexOutOfBoundsException ex){
           System.out.println("Array Index Out Of Bound >>> "+ ex);
       }
       System.out.println("After try/catch block");
    }
}
