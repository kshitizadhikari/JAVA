import java.util.Scanner;


public class Multiply_Number {
    public static void main(String[] args){
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter number: ");
        long num = scanObj.nextLong();
        num = num * 50;
        System.out.println("Number= " + num);

        System.out.println("Enter 1st Number: ");
        int num1 = scanObj.nextInt();

        System.out.println("Enter 2nd Number: ");
        int num2 = scanObj.nextInt();

        int result = num1 * num2;

        System.out.println("Result = " + result);
    }
}
