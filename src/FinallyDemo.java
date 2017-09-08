public class FinallyDemo {
    static void subRoutineA() {
        try{
            System.out.println("Inside subRoutineA >>> ");
            throw new RuntimeException("demo");
        }finally {
            System.out.println("subRoutineA's Finally...");
        }
    }

    static void subRoutineB(){
        try{
            System.out.println("Inside subRoutineB >>> ");
            return;
        }finally{
            System.out.println("subRoutineB's Finally...");
        }
    }

    static void subRoutineC(){
        try{
            System.out.println("Inside subRoutineC >>>");
        }finally {
            System.out.println("subRoutineC's Finally...");
        }
    }

    public static void main(String[] args) {
        try{
            subRoutineA();
        }catch (RuntimeException ex){
            System.out.println("Exception Caught while executing subRoutineA() >>> "+ ex +"\ncontinuing with the process...");
        }
        //subRoutineA();
        subRoutineB();
        subRoutineC();

    }
}
