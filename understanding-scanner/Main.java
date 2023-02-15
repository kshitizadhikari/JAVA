import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scannerObjScanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scannerObjScanner.nextLine();
        System.out.println("\nName: " + name);
    }

}