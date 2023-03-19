import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("1 = Multiplication Table\n2 = Currency Converter\n3 = Fibionacci Series");
        System.out.println("\n5 = Zero-based-Permutation Array");
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
//                QUESTION 1
                question1 q1 = new question1();
                System.out.print("Enter a number to print it's multiplication table : ");
                int num = scanner.nextInt();
                q1.multiplicationTable(num);
                break;

            case 2:
//                QUESTION 2
                question2 q2 = new question2();
                System.out.println("Enter Rupees to Convert to USD (1USD = 135.03R) : ");
                double rupees = scanner.nextDouble();
                System.out.println(rupees + " =  " + q2.rupeesToDollar(rupees));
                break;

            case 3:
//                QUESTION 3
                question3 q3 = new question3();
                System.out.print("Enter range : ");
                int range = scanner.nextInt();
                q3.fibonacciSeries(range);
                break;

            case 5:
//                QUESTION 5
                System.out.print("Enter length of array : ");
                int len = scanner.nextInt();
                int[] nums= new int[len];
                for (int i = 0; i < len; i++) {
                    System.out.print("Enter number : ");
                    nums[i] = scanner.nextInt();
                }
                question5 q5 = new question5();
                q5.arrayPer(nums);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }

}