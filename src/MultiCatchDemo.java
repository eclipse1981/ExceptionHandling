public class MultiCatchDemo {
    public static void main(String[] args) {
        try{
            int d = 42/args.length;
            int c[] = {1,2,3};
            c[10] = 4;
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException ex){
            System.out.println("Caught >>> " + ex);
        }
    }
}
