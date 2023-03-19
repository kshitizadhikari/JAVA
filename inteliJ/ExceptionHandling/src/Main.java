public class Main {
    public static void main(String[] args) {

        try {
            int divisor = 10;
            int dividend = 500;

            int result = dividend / divisor;
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Everything is okay");
        }

        anotherWork();

    }
    public static void anotherWork(){
        System.out.println("Another Work");
    }
}