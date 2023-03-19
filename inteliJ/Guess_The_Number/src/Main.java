import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("GUESS THE NUMBER !!!\n\n");


//        generate random number, say r
//        loop five times
//        take input from the user, say n
//        compare the numbers
//                if r==n -> user wins
//                if n>r -> too high
//                if n<r -> too low
//                else user loses

        //generate random number
        Random random = new Random();
        int randomNumber = random.nextInt(1, 20);

        //take input from the user
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i <= 5; i++) {
            if (i==5) {
                System.out.println("You Lost. Loser !!! ");
                break;
            }
            System.out.print("Enter a number between 1 and 20 : ");
            int userNumber = scanner.nextInt();

            if (randomNumber == userNumber){
                System.out.println("\nCORRECT. YOU WON !!!");
                break;
            } else if (userNumber > randomNumber) {
                if (userNumber > randomNumber + 2) {
                    System.out.println(userNumber + " is TOO High\n");
                } else {
                    System.out.println(userNumber + " is High\n");
                }
            } else if (userNumber < randomNumber) {
                if (userNumber < randomNumber - 2)  {
                    System.out.println(userNumber + " is TOO Low\n");
                } else {
                    System.out.println(userNumber + " is Low\n");
                }
            }



        }

    }
}