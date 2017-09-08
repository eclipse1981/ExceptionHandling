public class SuperSubCatch {
    public static void main(String[] args) {
        try {

        }catch (ArithmeticException ex){
            System.out.println("Generic Exception");
        }/*catch (ArithmeticException ex){
            System.out.println("This never reached...");
        }*/
    }
}
