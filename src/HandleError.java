import java.util.Random;

public class HandleError {

    public static void main(String[] args) {
        int a =0, b, c ;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            try{
                b = r.nextInt();
                c = r.nextInt();
                System.out.println("b : " + b + " c : "+ c);
                a = 12345 / (b/c);
            }catch (ArithmeticException ex){
                System.out.println("Division By Zero");
            }
            System.out.println("a :" + a);
        }
    }

}
