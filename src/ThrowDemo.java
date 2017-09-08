public class ThrowDemo {
    static void subRoutine(){
        try{
            throw new NullPointerException("demo");
            //throw new MyCustomNullPointerException("demoOne");
        }catch (NullPointerException ex){
            System.out.println("Caught inside routine...");
            throw ex;
        }/*catch (MyCustomNullPointerException ex){
            System.out.println("Caught for MyCustom Exception >>> " + ex);
        }*/
    }

    public static void main(String[] args) {
        try{
            ThrowDemo.subRoutine();
        }catch (NullPointerException ex){
            System.out.println("Re caught in main method..." + ex.getMessage());
        }
    }

   /* public static class MyCustomNullPointerException extends Exception{
        private String message;
        public MyCustomNullPointerException(String message){
            this.message = message;
        }

        @Override
        public String toString() {
            return "MyCustomNullPointerException["+ message +"]";
        }
    }*/
}
