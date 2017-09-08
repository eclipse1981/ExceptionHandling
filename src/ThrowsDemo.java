public class ThrowsDemo {
    static void subRoutine() throws IllegalAccessException{
        System.out.println("Inside throw One");
        throw new IllegalAccessException("Demo");
    }

    public static void main(String[] args) {
        try {
            subRoutine();
        } catch (IllegalAccessException e) {
            System.out.println("Throws from main class >>> " + e);
        }
    }
}
